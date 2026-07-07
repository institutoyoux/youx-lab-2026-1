medida = float(input('Uma distancia em metros: '))
km = medida // 1000
hm = medida // 100
dam = medida // 10
dm = medida * 10
cm = medida * 100
mm = medida * 1000
print('A medida de {}m corresponde a {}km e de {}hm e de {}dam e de {}dm e de {}cm e de {}mm'.format(medida, km, hm, dam, dm, cm, mm))