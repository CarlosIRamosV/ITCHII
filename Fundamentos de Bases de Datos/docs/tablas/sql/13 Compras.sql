SELECT factvtae.numfac, factvtae.fecha, factvtae.cvecli, clientes.razonsocial, factvtae.total, factvtad.idprod, productos.descripcion, factvtad.cantidad, factvtad.precio
FROM factvtae, factvtad, productos, clientes
WHERE factvtae.numfac = factvtad.numfac AND productos.id = factvtad.idprod AND clientes.id = factvtae.cvecli AND factvtae.numfac = 5;