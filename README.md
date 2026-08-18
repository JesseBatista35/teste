rm -rf node_modules .angular/cache package-lock.json
npm ci
npm run build && npm run coverage
