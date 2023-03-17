SELECT factcprae.numfac, factcprae.fecha, factcprae.cveprov, proveedores.razonsocial,factcprae.total, factcprad.idprod, productos.descripcion, factcprad.cantidad, factcprad.precio
FROM factcprad, factcprae, productos, proveedores
WHERE factcprad.numfac = factcprae.numfac AND factcprae.cveprov = proveedores.id AND factcprad.idprod = productos.id AND factcprae.numfac = 1025;