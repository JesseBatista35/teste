Quando $(library) = true → usa -DpomFile="$(Build.SourcesDirectory)/$(POM_PATH)" + -DgeneratePom=false (gera o POM completo).
Quando $(library) for diferente disso → mantém -DgeneratePom=true (comportamento padrão, sem quebrar quem não usa a flag).
