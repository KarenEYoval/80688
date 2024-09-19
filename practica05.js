const app = document.getElementById("app");
const url = "https://picsum.photos/id/";
const size = "/200/200";
const picture = (parametro) => {
  const src = url + parametro + size;
  return `
            <figure>
            <img src="https://picsum.photos/id/${parametro}/200/200" alt="" id = "${parametro} " class ="" >
            <figcaption>${parametro}</figcaption>
             </figure>
            `;
};
//console.log(picture())
app.innerHTML = picture(1) + picture(2) + picture(3);

const lista = document.querySelectorAll("img")
//console.log(lista)
//console.log(lista.length)

for (let i=0;i<lista.length;i++){
(lista[i]).addEventListener("click", miFuncion)
}
  

//const elemento1 = document.getElementById("1");
//const elemento2 = document.getElementById("2");
//const elemento3 = document.getElementById("3");
//elemento1.addEventListener("click", miFuncion);
//elemento2.addEventListener("click", miFuncion);
//elemento3.addEventListener("click", miFuncion);

function miFuncion(evento) {
  console.log("Ayyyy");
  console.log(evento.target);
  var imagen = evento.target
  imagen.classList.toggle("redonda")
}                   