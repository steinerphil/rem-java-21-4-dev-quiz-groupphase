import Header from './components/Header'
import './App.css'
import { Route, Switch } from 'react-router-dom'
import Homepage from './components/Pages/Homepage'
import AddQuestion from './components/Pages/Add-Question'
import useQuestions from './hooks/useQuestions'

function App() {
  const { questions, saveQuestion, getAllQuestions } = useQuestions()
  return (
    <div className="App">
      <Header />
      <Switch>
        <Route exact path="/">
          {getAllQuestions()}
          <Homepage questions={questions} />
        </Route>
        <Route exact path="/add-question">
          <AddQuestion saveQuestion={saveQuestion} />
        </Route>
      </Switch>
    </div>
  )
}

export default App
