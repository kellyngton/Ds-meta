import "./Style.css";
import logo from "../../assets/img/logo.png";
function Header(){
    return(
        <header>
        <div className="dsmeta-logo-container">
            <img src={logo} alt="DSMeta" />
            <h1>DSMeta</h1>
            <p>
              Desenvolvido por
              <a href="https://www.instagram.com/devsuperior.ig"> @devsuperior.ig </a>
               
            </p>
            <p>
            Replicado por
            <a href="https://github.com/kellyngton"> kellyngton.dias</a>
            </p>
        </div>
    </header>
    )
}
export default Header;