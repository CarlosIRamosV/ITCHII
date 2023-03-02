select factcprae.numfac, factcprae.fecha, factcprae.cveprov, proveedores.razonsocial, factcprae.total, factcprad.idprod, productos.descripcion, factcprad.cantidad, factcprad.precio
from factcprae,factcprad,proveedores,productos
where factcprae.numfac=factcprad.numfac and factcprae.cveprov=proveedores.id and factcprad.idprod=productos.id and factcprae.numfac=2;