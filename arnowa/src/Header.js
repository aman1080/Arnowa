import React from "react";
import arnowa from "./arnowa.png";
import "../node_modules/bootstrap/dist/css/bootstrap.min.css"
import { Card } from "react-bootstrap";
function Header(){
    return(
        <>
            <div className="container-fluid text-center p-3" style={{background:"lightblue"}} >
                <img src={arnowa} style={{width:400}}/>
                <br />
                
            </div>
           
        </>
    );
}

export default Header;