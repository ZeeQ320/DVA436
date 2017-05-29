/**
 */
package behaviourMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variable Affectation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourMM.variableAffectation#getReceivedVariable <em>Received Variable</em>}</li>
 * </ul>
 *
 * @see behaviourMM.BehaviourMMPackage#getvariableAffectation()
 * @model
 * @generated
 */
public interface variableAffectation extends Affectation {
	/**
	 * Returns the value of the '<em><b>Received Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received Variable</em>' containment reference.
	 * @see #setReceivedVariable(Variable)
	 * @see behaviourMM.BehaviourMMPackage#getvariableAffectation_ReceivedVariable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Variable getReceivedVariable();

	/**
	 * Sets the value of the '{@link behaviourMM.variableAffectation#getReceivedVariable <em>Received Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received Variable</em>' containment reference.
	 * @see #getReceivedVariable()
	 * @generated
	 */
	void setReceivedVariable(Variable value);

} // variableAffectation
