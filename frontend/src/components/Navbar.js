import { NavLink } from 'react-router-dom'
import styled from 'styled-components'
function Navbar() {
  return (
    <NavBarContainer>
      <NavLink to="/">Home</NavLink>
      <NavLink to="/add-question">Add Question</NavLink>
    </NavBarContainer>
  )
}
export default Navbar

const NavBarContainer = styled.section`
  display: flex;
  justify-content: center;
  gap: 40px;
`
