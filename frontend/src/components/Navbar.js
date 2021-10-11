import {NavLink} from "react-router-dom";

function Navbar(){
    return (
        <div>
            <NavLink to="/">Home</NavLink>
            <NavLink to="/add-question">Add Question</NavLink>
        </div>
    );
}
export default Navbar;