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
`

const Logo = styled(HiAcademicCap)`
  font-size: 100px;
`
