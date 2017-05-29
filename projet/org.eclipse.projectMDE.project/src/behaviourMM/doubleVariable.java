/**
 */
package behaviourMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>double Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourMM.doubleVariable#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see behaviourMM.BehaviourMMPackage#getdoubleVariable()
 * @model
 * @generated
 */
public interface doubleVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see behaviourMM.BehaviourMMPackage#getdoubleVariable_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link behaviourMM.doubleVariable#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // doubleVariable
