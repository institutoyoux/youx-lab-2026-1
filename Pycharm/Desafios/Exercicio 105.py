def dic(* no, sit=False):
    d = {
        "total": 0,
        "maior": 0,
        "menor": 0,
        "media": 0
    }
    total = 0
    for i in no:
        if i == no[0]:
            d["maior"] = i
            d["menor"] = i
        elif i > d["maior"]:
            d["maior"] = i
        elif i < d["menor"]:
            d["menor"] = i
        d["total"] += i
    d["media"] = d["total"] / len(no)
    if sit:
        if d["media"] < 5:
            d["situação"] = "Ruim"
        elif d["media"] < 7:
            d["situação"] = "Media"
        if d["media"] < 5:
            d["situação"] = "Boa"
        return d
    else:
        return d
print(dic(3,3,5, sit=True))