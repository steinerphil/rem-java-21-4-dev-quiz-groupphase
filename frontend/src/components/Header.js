import { HiAcademicCap } from 'react-icons/hi'
import Navbar from './Navbar'
import styled from 'styled-components'

function Header() {
  return (
    <HeaderContainer>
      <Logo />
      <Navbar />
    </HeaderContainer>
  )
}
export default Header

const HeaderContainer = styled.section`
  display: grid;
  grid-template-columns: min-content 1fr;
  justify-content: space-between;
  align-items: center;
  background-color: #E1CE7A;
  font-family: 'Montserrat', sans-serif;
  font-size: 30px;

`

const Logo = styled(HiAcademicCap)`
  font-size: 100px;
  color: white;
`
