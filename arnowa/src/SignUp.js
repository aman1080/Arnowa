import React from "react";
import arnowa from "./arnowa.png";
import Header from "./Header";
function Signup() {
    return (
        <>
            <Header />
            <div className="container" style={{ width: 650 }}>
                <br />
                
                        <h1 className="text-center">Sign Up</h1>
                        <br />
                        <form>
                            <div className="mb-3">
                                Full Name
                                <input type="text" class="form-control"  name="fullName" placeholder="Enter your FullName" />

                            </div>
                            <div className="mb-3">
                                Email Address
                                <input type="email" className="form-control"  name="email" placeholder="Enter Email Address" />

                            </div>
                            <div className="mb-3">
                                Password
                                <input type="password" className="form-control" name="password" placeholder="Enter  Password" />

                            </div>
                            <div className="mb-3">

                                Confirm Password
                                <input type="password" className="form-control"  name="confirm Password" placeholder="Enter Confirm Password" />

                            </div>
                            <br />


                            <div className="text-center"><button type="submit" className="btn btn-primary text-center">Submit</button></div>
                            
                        </form>
                   

            </div>
        </>
    );
}

export default Signup;