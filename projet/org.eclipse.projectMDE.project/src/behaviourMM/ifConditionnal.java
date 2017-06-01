/**
 */
package behaviourMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>if Conditionnal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourMM.ifConditionnal#getCondition <em>Condition</em>}</li>
 *   <li>{@link behaviourMM.ifConditionnal#getElseC <em>Else C</em>}</li>
 * </ul>
 *
 * @see behaviourMM.BehaviourMMPackage#getifConditionnal()
 * @model
 * @generated
 */
public interface ifConditionnal extends Conditionnal {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Operator)
	 * @see behaviourMM.BehaviourMMPackage#getifConditionnal_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operator getCondition();

	/**
	 * Sets the value of the '{@link behaviourMM.ifConditionnal#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Operator value);

	/**
	 * Returns the value of the '<em><b>Else C</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else C</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else C</em>' containment reference.
	 * @see #setElseC(elseConditionnal)
	 * @see behaviourMM.BehaviourMMPackage#getifConditionnal_ElseC()
	 * @model containment="true"
	 * @generated
	 */
	elseConditionnal getElseC();

	/**
	 * Sets the value of the '{@link behaviourMM.ifConditionnal#getElseC <em>Else C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else C</em>' containment reference.
	 * @see #getElseC()
	 * @generated
	 */
	void setElseC(elseConditionnal value);

} // ifConditionnal
