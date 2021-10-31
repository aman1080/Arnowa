import Button from "@restart/ui/esm/Button";
import React from "react";
import arnowa from "./arnowa.png";
import Header from "./Header";
function Signin() {
    return (
        <>
            <Header />
            <div className="container" style={{width:650}}>
                <br />
                
                        <h1 className="text-center">Log in</h1>
                        <br />
                        <form>
                            <div className="mb-3">
                                UserName
                                <input type="email" className="form-control"  name="userName"  placeholder="Enter Your UserName or Email Address Here "/>
                                
                            </div>
                            <div class="mb-3">
                               Password
                                <input type="password" className="form-control" id="exampleInputPassword1" placeholder="Enter Your Password Here" />
                            </div>
                           
                            <button type="submit" className="btn btn-primary form-control ">Login</button>
                            <br />
                            <div className="text-center">
                            don't have an account <a href="">SignUp</a><br />
                            Forget Password <a href="">Click Here</a>
                            </div>
                        </form>
                 

            </div>




        </>
    );
}

export default Signin;