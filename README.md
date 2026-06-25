// Karma configuration file, see link for more information
// https://karma-runner.github.io/1.0/config/configuration-file.html
 
module.exports = function (config) {
    config.set({
        basePath: '',
        frameworks: ['jasmine', '@angular-devkit/build-angular'],
        plugins: [
            require('karma-jasmine'),
            //require('karma-firefox-launcher'),
            require('karma-jasmine-html-reporter'),
            require('karma-junit-reporter'),
            require('karma-coverage-istanbul-reporter'),
            require('@angular-devkit/build-angular/plugins/karma'),
            require('karma-sonarqube-reporter'),
            require('karma-spec-reporter'),
        ],
        client: {
            jasmine: {
                random: false, // run tests in the order they are defined
            },
            clearContext: false, // leave Jasmine Spec Runner output visible in browser
        },
        jasmineHtmlReporter: {
            suppressAll: true, // removes the duplicated traces
        },
 
        junitReporter: {
            outputDir: 'junit', // results will be saved as $outputDir/$browserName.xml
        },
 
        coverageReporter: {
            dir: require('path').join(__dirname, 'coverage'),
            subdir: '.',
            reporters: [{ type: 'html' }, { type: 'lcovonly' }, { type: 'text-summary' }],
        },
        proxies: {
            '/assets/': '/base/src/assets/',
        },
        files: 
            [
            { pattern: './src/assets/**', watched: false, included: false, nocache: false, served: true },
            { pattern: './src/typography-font-faces.css', watched: false, included: true, nocache: false, served: true },
            { pattern: './src/assets/svg/icons/**', watched: false, included: false, nocache: false, served: true }],
        sonarqubeReporter: {
            basePath: 'src/app',
            filePattern: '**/*spec.ts',
            encoding: 'utf-8',
            outputFolder: 'reports',
            legacyMode: false,
            reportName: function (metadata) {
                return 'sonarqubeTestReport.xml';
            },
        },
 
        coverageIstanbulReporter: {
            dir: require('path').join(__dirname, 'coverage'),
            reports: ['html', 'lcovonly', 'text-summary'],
            fixWebpackSourcePaths: true,
        },
 
        reporters: ['progress', 'kjhtml', 'junit', 'coverage-istanbul', 'sonarqube', 'spec'],
        port: 9876,
        colors: true,
        logLevel: config.LOG_INFO,
        autoWatch: false,
        browsers: ['ChromeHeadless'],
        singleRun: true,
        restartOnFileChange: true,
    });
};
