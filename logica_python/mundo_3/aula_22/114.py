import urllib
import urllib.request

try:
    site = urllib.request.url
except urllib.error.URLError:
    print('O site Pudim não está disponível. ')
else:
    print('Tudo ok!')