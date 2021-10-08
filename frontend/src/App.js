
import Header from "./components/Header";

function App() {
  return (
    <div className="App">
      <Header/>
      <body>
        <section>
          <div className="question">
            <p className="question-text"> Your Question here!</p>
            <div className="answers">
              <ul>
                <li>Answer 1</li>
                <li>Answer 2</li>
                <li>Answer 3</li>
              </ul>
            </div>
          </div>
          <div className="question">
            <p className="question-text"> Your Question here!</p>
            <div className="answers">
              <ul>
                <li>Answer 1</li>
                <li>Answer 2</li>
                <li>Answer 3</li>
              </ul>
            </div>
          </div>
          <div className="question">
            <p className="question-text"> Your Question here!</p>
            <div className="answers">
              <ul>
                <li>Answer 1</li>
                <li>Answer 2</li>
                <li>Answer 3</li>
              </ul>
            </div>
          </div>
          <div className="question">
            <p className="question-text"> Your Question here!</p>
            <div className="answers">
              <ul>
                <li>Answer 1</li>
                <li>Answer 2</li>
                <li>Answer 3</li>
              </ul>
            </div>
          </div>
          <div className="question">
            <p className="question-text"> Your Question here!</p>
            <div className="answers">
              <ul>
                <li>Answer 1</li>
                <li>Answer 2</li>
                <li>Answer 3</li>
              </ul>
            </div>
          </div>
        </section>
      </body>
      <hr />
      <h2>Add Question Page</h2>
      <body>
        <form className="question">
          <textarea placeholder="Insert your Question here...." />
          <section>
            <div className="answer-1">
              <p>Answer 1</p>
              <input className="answer-1-text" />
              <p>Is Correct?</p>
              <input type="radio" className="isCorrect" />
            </div>
            <div className="answer-2">
              <p>Answer 2</p>
              <input className="answer-2-text" />
              <p>Is Correct?</p>
              <input type="radio" className="isCorrect" />
            </div>
            <button type="button">New answer</button>
          </section>
        </form>
      </body>
    </div>
  )
}

export default App
