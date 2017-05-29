/**
 */
package behaviourMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>for Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourMM.forLoop#getIteration <em>Iteration</em>}</li>
 *   <li>{@link behaviourMM.forLoop#getConditionStop <em>Condition Stop</em>}</li>
 *   <li>{@link behaviourMM.forLoop#getStartValue <em>Start Value</em>}</li>
 * </ul>
 *
 * @see behaviourMM.BehaviourMMPackage#getforLoop()
 * @model
 * @generated
 */
public interface forLoop extends Loop {
	/**
	 * Returns the value of the '<em><b>Iteration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iteration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iteration</em>' reference.
	 * @see #setIteration(Operator)
	 * @see behaviourMM.BehaviourMMPackage#getforLoop_Iteration()
	 * @model required="true"
	 * @generated
	 */
	Operator getIteration();

	/**
	 * Sets the value of the '{@link behaviourMM.forLoop#getIteration <em>Iteration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iteration</em>' reference.
	 * @see #getIteration()
	 * @generated
	 */
	void setIteration(Operator value);

	/**
	 * Returns the value of the '<em><b>Condition Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Stop</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Stop</em>' containment reference.
	 * @see #setConditionStop(Operator)
	 * @see behaviourMM.BehaviourMMPackage#getforLoop_ConditionStop()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operator getConditionStop();

	/**
	 * Sets the value of the '{@link behaviourMM.forLoop#getConditionStop <em>Condition Stop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Stop</em>' containment reference.
	 * @see #getConditionStop()
	 * @generated
	 */
	void setConditionStop(Operator value);

	/**
	 * Returns the value of the '<em><b>Start Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Value</em>' containment reference.
	 * @see #setStartValue(Affectation)
	 * @see behaviourMM.BehaviourMMPackage#getforLoop_StartValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Affectation getStartValue();

	/**
	 * Sets the value of the '{@link behaviourMM.forLoop#getStartValue <em>Start Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Value</em>' containment reference.
	 * @see #getStartValue()
	 * @generated
	 */
	void setStartValue(Affectation value);

} // forLoop
