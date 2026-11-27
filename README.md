import { ComponentFixture, TestBed } from '@angular/core/testing';
import { BreakpointObserver, BreakpointState } from '@angular/cdk/layout';
import { of } from 'rxjs';

import { DscHeader } from './header';
import { DscDrawerService } from '../drawer-panel/drawer.service';
import type { DscDrawerSearchConfig } from '../drawer-panel/drawer-panel.model';

class BreakpointObserverMock {
  observe = vi.fn((_query: string | readonly string[]) =>
    of<BreakpointState>({ matches: false, breakpoints: {} }),
  );
}

class DrawerServiceMock {
  open = vi.fn();
  close = vi.fn();
  isOpen = vi.fn(() => false);
}

type CompAny = any;

describe('DscHeader', () => {
  let fixture: ComponentFixture<DscHeader>;
  let comp: DscHeader;
  let el: HTMLElement;
  let breakpoint: BreakpointObserverMock;
  let drawer: DrawerServiceMock;

  const recreate = (matches: boolean): void => {
    breakpoint.observe.mockReturnValue(of({ matches, breakpoints: {} }));
    fixture = TestBed.createComponent(DscHeader);
    comp = fixture.componentInstance;
    el = fixture.nativeElement as HTMLElement;
  };

  beforeEach(async () => {
    breakpoint = new BreakpointObserverMock();
    drawer = new DrawerServiceMock();

    await TestBed.configureTestingModule({
      imports: [DscHeader],
      providers: [
        { provide: BreakpointObserver, useValue: breakpoint },
        { provide: DscDrawerService, useValue: drawer },
      ],
    }).compileComponents();

    fixture = TestBed.createComponent(DscHeader);
    comp = fixture.componentInstance;
    el = fixture.nativeElement as HTMLElement;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(comp).toBeTruthy();
  });

  it('should have default input values', () => {
    expect(comp.variant()).toBe('default');
    expect(comp.searchText()).toBe('');
    expect(comp.searchPlaceholder()).toBe('Buscar');
    expect(comp.logoHref()).toBe('#');
    expect(comp.logoAriaLabel()).toBe('Logotipo Gerenciador CAIXA');
    expect(comp.searchMode()).toBe('submit');
    expect(comp.accountSelectAwaysVisible()).toBeUndefined();
    expect(comp.accountSelectThreshold()).toBe(100);
    expect(comp.showNotification()).toBe(true);
    expect(comp.notificationShowBadge()).toBe(false);
    expect(comp.notificationBadgeValue()).toBe('0');
    expect(comp.notificationBadgeSize()).toBe('small');
    expect(comp.notificationBadgeOutline()).toBe(false);
    expect(comp.notificationBadgeStroke()).toBe('thin');
  });

  it('should apply base and default variant classes on host', () => {
    expect(el.classList.contains('header')).toBe(true);
    expect(el.classList.contains('header--default')).toBe(true);
  });

  it('should update variant class when variant changes', () => {
    fixture.componentRef.setInput('variant', 'pre-home');
    fixture.detectChanges();
    expect(el.classList.contains('header--pre-home')).toBe(true);
    expect((comp as CompAny).dynamicClasses()).toBe('header header--pre-home');
  });

  it('should use menu icon for default variant', () => {
    expect((comp as CompAny).menuIcon()).toBe('iconoir-menu');
  });

  it('should use back-arrow icon for pre-home variant', () => {
    fixture.componentRef.setInput('variant', 'pre-home');
    fixture.detectChanges();
    expect((comp as CompAny).menuIcon()).toBe('iconoir-nav-arrow-left');
  });

  it('should show search and account sections for non pre-home variants', () => {
    expect((comp as CompAny).showSearch()).toBe(true);
    expect((comp as CompAny).showAccountSection()).toBe(true);
  });

  it('should hide search and account sections for pre-home variant', () => {
    fixture.componentRef.setInput('variant', 'pre-home');
    fixture.detectChanges();
    expect((comp as CompAny).showSearch()).toBe(false);
    expect((comp as CompAny).showAccountSection()).toBe(false);
  });

  it('should return default search bar state by default', () => {
    expect((comp as CompAny).searchBarState()).toBe('default');
  });

  it('should return focus state when variant is search-focus and search is expanded', () => {
    recreate(true);
    fixture.componentRef.setInput('variant', 'search-focus');
    fixture.detectChanges();
    expect((comp as CompAny).searchBarState()).toBe('focus');
  });

  it('should not show account labels when none provided', () => {
    expect((comp as CompAny).showAccountLabels()).toBe(false);
    expect((comp as CompAny).showAccountLabel2()).toBe(false);
  });

  it('should show account labels when provided', () => {
    fixture.componentRef.setInput('accountLabel1', 'Conta');
    fixture.componentRef.setInput('accountLabel2', '12345-6');
    fixture.detectChanges();
    expect((comp as CompAny).showAccountLabels()).toBe(true);
    expect((comp as CompAny).showAccountLabel2()).toBe(true);
  });

  it('should never show account labels for pre-home variant', () => {
    fixture.componentRef.setInput('variant', 'pre-home');
    fixture.componentRef.setInput('accountLabel1', 'Conta');
    fixture.detectChanges();
    expect((comp as CompAny).showAccountLabels()).toBe(false);
  });

  it('should not show user labels when none provided', () => {
    expect((comp as CompAny).showUserLabels()).toBe(false);
    expect((comp as CompAny).showUserLabel2()).toBe(false);
  });

  it('should show user labels when provided', () => {
    fixture.componentRef.setInput('userLabel1', 'João');
    fixture.componentRef.setInput('userLabel2', 'Silva');
    fixture.detectChanges();
    expect((comp as CompAny).showUserLabels()).toBe(true);
    expect((comp as CompAny).showUserLabel2()).toBe(true);
  });

  it('should be account-select visible when always visible flag is set', () => {
    fixture.componentRef.setInput('accountSelectAwaysVisible', true);
    fixture.detectChanges();
    expect(comp.isAccountSelectVisible()).toBe(true);
  });

  it('should emit searchButtonClicked on search icon click', () => {
    const spy = vi.spyOn(comp.searchButtonClicked, 'emit');
    const event = new MouseEvent('click');
    (comp as CompAny).onSearchIconClick(event);
    expect(spy).toHaveBeenCalledWith(event);
  });

  it('should not open drawer on desktop when no search drawer config is provided', () => {
    recreate(true);
    fixture.detectChanges();
    (comp as CompAny).onSearchIconClick(new MouseEvent('click'));
    expect(drawer.open).not.toHaveBeenCalled();
  });

  it('should open fallback search drawer when search is collapsed and no config is provided', () => {
    (comp as CompAny).onSearchIconClick(new MouseEvent('click'));
    expect(drawer.open).toHaveBeenCalledWith(
      expect.objectContaining({ type: 'search', title: 'Buscar', showRecent: false }),
    );
  });

  it('should open drawer with config when search drawer config is provided', () => {
    const config = { title: 'Busca' } as unknown as DscDrawerSearchConfig;
    fixture.componentRef.setInput('searchDrawerConfig', config);
    fixture.detectChanges();
    (comp as CompAny).onSearchIconClick(new MouseEvent('click'));
    expect(drawer.open).toHaveBeenCalledWith(config);
  });

  it('should emit searchTextChange when mode is textchange', () => {
    fixture.componentRef.setInput('searchMode', 'textchange');
    fixture.detectChanges();
    const changeSpy = vi.spyOn(comp.searchTextChange, 'emit');
    const submitSpy = vi.spyOn(comp.searchSubmitted, 'emit');

    (comp as CompAny).handleSearchEvent('abc', 'textchange');

    expect(changeSpy).toHaveBeenCalledWith('abc');
    expect(submitSpy).not.toHaveBeenCalled();
  });

  it('should emit searchSubmitted when mode is submit', () => {
    fixture.componentRef.setInput('searchMode', 'submit');
    fixture.detectChanges();
    const changeSpy = vi.spyOn(comp.searchTextChange, 'emit');
    const submitSpy = vi.spyOn(comp.searchSubmitted, 'emit');

    (comp as CompAny).handleSearchEvent('query', 'submit');

    expect(submitSpy).toHaveBeenCalledWith('query');
    expect(changeSpy).not.toHaveBeenCalled();
  });

  it('should not emit when event type does not match search mode', () => {
    fixture.componentRef.setInput('searchMode', 'submit');
    fixture.detectChanges();
    const changeSpy = vi.spyOn(comp.searchTextChange, 'emit');
    const submitSpy = vi.spyOn(comp.searchSubmitted, 'emit');

    (comp as CompAny).handleSearchEvent('abc', 'textchange');

    expect(changeSpy).not.toHaveBeenCalled();
    expect(submitSpy).not.toHaveBeenCalled();
  });
});
