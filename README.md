[...document.querySelectorAll('option')].filter(o => /192\.168\.2(2[4-9]|[3-5]\d)\.|BKP/i.test(o.text)).map(o => o.text)
