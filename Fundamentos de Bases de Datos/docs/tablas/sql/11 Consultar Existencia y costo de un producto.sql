select almacen.numfac,  almacen.idprod, productos.descripcion, almacen.tipomov, almacen.cantidad, almacen.precio
from almacen, productos
where almacen.idprod = productos.id
and productos.id = 1