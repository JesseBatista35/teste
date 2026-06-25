#!/bin/bash
set -e
rm -rf node_modules package-lock.json
npm cache clean --force
npm install --ignore-scripts --no-audit --verbose
npx ngcc --properties es2015 browser module main --first-only --create-ivy-entry-points
