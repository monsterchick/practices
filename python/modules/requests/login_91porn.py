import requests


headers = {
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36",
    "content-type": "text/html; charset=UTF-8",
    "cookie": "language=zh_ZH; 91username=f793QS9SF76euwNNEWfiPXfs%2Fa3qCGcExVHUlI59Hp69F7aDW0LE8w; __utmz=50351329.1681224427.24.4.utmcsr=google|utmccn=(organic)|utmcmd=organic|utmctr=(not%20provided); __utma=50351329.492390638.1681015677.1683250064.1683328370.29; __utmc=50351329; CLIPSHARE=ed8dc041a5cdaf9e7d581238ceb19b10; DUID=6e86v2PA8XHeIFc7PWbQKnMsDQfJU8LeRTLG2sYuGOn7z%2FPkfw; USERNAME=562dRugT1l4DPjD7m3cRg3lRpVN5M7IhIvm4ladJvIp%2FAewrE7iRQg; EMAILVERIFIED=no; school=f2f30DkYOf21LRSAPIJ5tzKJ4rYs0iGCdTVL21I; level=67d0Z5n%2BIl9blKZAMCY%2FHGd%2BLJL%2FliOyzu00OY6D; __utmb=50351329.13.10.1683328370; amp_adc4c4=Ql0LM-aDpp6Cgd8Z5appjn.Vkh5OFNoTFp3MFVrak1GeFhUYXFhcWJWZ0FDMg==..1gvn3110i.1gvn4khoq.1.nk.nl"
}
url = 'https://www.91porn.com/index.php'

response = requests.get(url=url,headers=headers)
text = response.text
print(text)