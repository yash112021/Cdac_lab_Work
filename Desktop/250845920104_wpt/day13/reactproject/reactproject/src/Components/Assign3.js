
// 3)  accept data in textfield and take 3 radio buttons 
//      on  -  uppercase , lowercase and Title Case 

// on selection on that Radio button display appropiate output 

import './Helo.css'
import React, { useState } from 'react'

export default function Assign3() {
  const [data, setData] = useState('')
  const [caseType, setCaseType] = useState('uppercase')

  const toTitleCase = (str) => {
    return str
      .toLowerCase()
      .split(' ')
      .map(word => word.charAt(0).toUpperCase() + word.slice(1))
      .join(' ')
  }

  let output = data
  if (caseType === 'uppercase') output = data.toUpperCase()
  else if (caseType === 'lowercase') output = data.toLowerCase()
  else if (caseType === 'titlecase') output = toTitleCase(data)

  return (
    <>
      <div style={{display: "inline-block", marginLeft: "300px"}}>
        <h1><b>Enter your data</b></h1>
        <div className="mb-3">
          <textarea
            className="form-control"
            rows="4"
            cols="50"
            value={data}
            onChange={e => setData(e.target.value)}
          ></textarea>
        </div>
        <div className="buttns my-3">
          <input
            type="radio"
            id="uppercase"
            value="uppercase"
            checked={caseType === 'uppercase'}
            onChange={() => setCaseType('uppercase')}
          />
          <label htmlFor="uppercase">UpperCase</label>

          <input
            type="radio"
            id="lowercase"
            value="lowercase"
            checked={caseType === 'lowercase'}
            onChange={() => setCaseType('lowercase')}
            style={{ marginLeft: '10px' }}
          />
          <label htmlFor="lowercase">Lowercase</label>

          <input
            type="radio"
            id="titlecase"
            value="titlecase"
            checked={caseType === 'titlecase'}
            onChange={() => setCaseType('titlecase')}
            style={{ marginLeft: '10px' }}
          />
          <label htmlFor="titlecase">Title Case</label>
        </div>
      </div>
      <div id="para">
        <p>{output}</p>
      </div>
    </>
  )
}

