import urllib.request

site = "http://pudim.com.br"

try:
    # Tenta abrir o site
    site_web = urllib.request.urlopen(site)
except urllib.error.URLError:
    print(f"O site {site} NÃO está acessível no momento. Verifique sua conexão.")
else:
    print(f"O site {site} está acessível e funcionando perfeitamente!")

