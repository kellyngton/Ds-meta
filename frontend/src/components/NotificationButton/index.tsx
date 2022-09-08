import icon from "../../assets/img/Vector.png"
import "./Style.css"

function NotificationButton() {
  return(
    <>
        <div className = "dsmeta-red-btn">
            <img src={icon} alt="Notificar" />
        </div>
    </>
  )
}

export default NotificationButton
