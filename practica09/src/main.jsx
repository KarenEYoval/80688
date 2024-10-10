import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import App from "./App.jsx";
import "./main.css";
import MiFieldSet from "./MifieldSet/MiFieldSet.jsx";


createRoot(document.getElementById("root")).render(
  <StrictMode>
   {/* <App />*/}


  <form action="">
  <MiFieldSet p1="Titulo"  id1="1" p2="Nombre" id2 ="2" p3="Password" />
  <input type="submit" value="Enviar"  />
  </form>
    
  </StrictMode>
);
