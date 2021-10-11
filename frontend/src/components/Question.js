import * as React from 'react'
import Answer from './Answer'
import styled from 'styled-components'

function Question({ question }) {
  return (
    <QuestionContainer>
      <h3>{question.questionText}</h3>
      <AnswerContainer>
        {question.answers.map(answer => (
          <Answer answer={answer} key={answer.id} questionId={question.id} />
        ))}
      </AnswerContainer>
      <CheckButton>Check Answer</CheckButton>
    </QuestionContainer>
  )
}
export default Question

const QuestionContainer = styled.section`
  width: 400px;
  border: 1px solid #009fb7;
`

const AnswerContainer = styled.section`
  display: grid;
  grid-template-columns: 1fr 1fr;
  grid-template-rows: 1fr 1fr;
  gap: 0px 0px;
  grid-template-areas:
    '. .'
    '. .';
`
const CheckButton = styled.button`
  box-shadow: inset 0px 1px 0px 0px #ffffff;
  background: linear-gradient(to bottom, #ededed 5%, #dfdfdf 100%);
  background-color: #ededed;
  border-radius: 6px;
  border: 1px solid #dcdcdc;
  display: inline-block;
  cursor: pointer;
  color: #777777;
  font-family: Arial;
  font-size: 15px;
  font-weight: bold;
  padding: 6px 24px;
  text-decoration: none;
  text-shadow: 0px 1px 0px #ffffff;
  &:hover {
    background: linear-gradient(to bottom, #dfdfdf 5%, #ededed 100%);
    background-color: #dfdfdf;
  }
  &:active {
    position: relative;
    top: 1px;
  }
`
