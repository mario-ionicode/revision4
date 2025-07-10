const productos = [
  { nombre: "Zapato negro", tipo: "zapato", color: "negro", img: "./taco-negro.jpg" },
  { nombre: "Zapato azul", tipo: "zapato", color: "azul", img: "./taco-azul.jpg" },
  { nombre: "Bota negra", tipo: "bota", color: "negro", img: "./bota-negra.jpg" },
  { nombre: "Bota azul", tipo: "bota", color: "azul", img: "./bota-azul.jpg" },
  { nombre: "Zapato rojo", tipo: "zapato", color: "rojo", img: "./zapato-rojo.jpg" }
];

const li = document.getElementById("lista-de-productos"); // se modifica el getElementByName 
const $i = document.querySelector('.input');
const botonDeFiltro = document.querySelector("button");

// se cambia la fuction display para que se pueda rendirzar mejor
function displayProductos(productosAMostrar) {
  li.innerHTML = ""; // limpia

  productosAMostrar.forEach(producto => {
    const d = document.createElement("div");
    d.classList.add("producto");

    const ti = document.createElement("p");
    ti.classList.add("titulo");
    ti.textContent = producto.nombre;

    const imagen = document.createElement("img");
    imagen.setAttribute("src", producto.img);

    d.appendChild(ti);
    d.appendChild(imagen);

    li.appendChild(d);
  });
}

const filtrado = (productos = [], texto) => {
  return productos.filter(item =>
    item.tipo.includes(texto.toLowerCase()) ||
    item.color.includes(texto.toLowerCase())
  );
};

botonDeFiltro.onclick = function () {
  const texto = $i.value.trim().toLowerCase();
  const productosFiltrados = filtrado(productos, texto);
  displayProductos(productosFiltrados);
};

// Mostrar todos al cargar
displayProductos(productos);