/**
 */
package behaviourMM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see behaviourMM.BehaviourMMPackage
 * @generated
 */
public interface BehaviourMMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviourMMFactory eINSTANCE = behaviourMM.impl.BehaviourMMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>for Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>for Loop</em>'.
	 * @generated
	 */
	forLoop createforLoop();

	/**
	 * Returns a new object of class '<em>addition Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>addition Operator</em>'.
	 * @generated
	 */
	additionOperator createadditionOperator();

	/**
	 * Returns a new object of class '<em>soustraction Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>soustraction Operator</em>'.
	 * @generated
	 */
	soustractionOperator createsoustractionOperator();

	/**
	 * Returns a new object of class '<em>multiplication Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>multiplication Operator</em>'.
	 * @generated
	 */
	multiplicationOperator createmultiplicationOperator();

	/**
	 * Returns a new object of class '<em>division Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>division Operator</em>'.
	 * @generated
	 */
	divisionOperator createdivisionOperator();

	/**
	 * Returns a new object of class '<em>equal Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>equal Operator</em>'.
	 * @generated
	 */
	equalOperator createequalOperator();

	/**
	 * Returns a new object of class '<em>inferior Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>inferior Operator</em>'.
	 * @generated
	 */
	inferiorOperator createinferiorOperator();

	/**
	 * Returns a new object of class '<em>superior Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>superior Operator</em>'.
	 * @generated
	 */
	superiorOperator createsuperiorOperator();

	/**
	 * Returns a new object of class '<em>inferior Or Equal Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>inferior Or Equal Operator</em>'.
	 * @generated
	 */
	inferiorOrEqualOperator createinferiorOrEqualOperator();

	/**
	 * Returns a new object of class '<em>superior Or Equal Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>superior Or Equal Operator</em>'.
	 * @generated
	 */
	superiorOrEqualOperator createsuperiorOrEqualOperator();

	/**
	 * Returns a new object of class '<em>and Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>and Operator</em>'.
	 * @generated
	 */
	andOperator createandOperator();

	/**
	 * Returns a new object of class '<em>or Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>or Operator</em>'.
	 * @generated
	 */
	orOperator createorOperator();

	/**
	 * Returns a new object of class '<em>no Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>no Operator</em>'.
	 * @generated
	 */
	noOperator createnoOperator();

	/**
	 * Returns a new object of class '<em>int Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>int Variable</em>'.
	 * @generated
	 */
	intVariable createintVariable();

	/**
	 * Returns a new object of class '<em>double Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>double Variable</em>'.
	 * @generated
	 */
	doubleVariable createdoubleVariable();

	/**
	 * Returns a new object of class '<em>bool Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>bool Variable</em>'.
	 * @generated
	 */
	boolVariable createboolVariable();

	/**
	 * Returns a new object of class '<em>char Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>char Variable</em>'.
	 * @generated
	 */
	charVariable createcharVariable();

	/**
	 * Returns a new object of class '<em>string Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>string Variable</em>'.
	 * @generated
	 */
	stringVariable createstringVariable();

	/**
	 * Returns a new object of class '<em>if Conditionnal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>if Conditionnal</em>'.
	 * @generated
	 */
	ifConditionnal createifConditionnal();

	/**
	 * Returns a new object of class '<em>else Conditionnal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>else Conditionnal</em>'.
	 * @generated
	 */
	elseConditionnal createelseConditionnal();

	/**
	 * Returns a new object of class '<em>operation Affectation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>operation Affectation</em>'.
	 * @generated
	 */
	operationAffectation createoperationAffectation();

	/**
	 * Returns a new object of class '<em>variable Affectation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>variable Affectation</em>'.
	 * @generated
	 */
	variableAffectation createvariableAffectation();

	/**
	 * Returns a new object of class '<em>int Affectation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>int Affectation</em>'.
	 * @generated
	 */
	intAffectation createintAffectation();

	/**
	 * Returns a new object of class '<em>double Affectation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>double Affectation</em>'.
	 * @generated
	 */
	doubleAffectation createdoubleAffectation();

	/**
	 * Returns a new object of class '<em>bool Affectation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>bool Affectation</em>'.
	 * @generated
	 */
	boolAffectation createboolAffectation();

	/**
	 * Returns a new object of class '<em>char Affectation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>char Affectation</em>'.
	 * @generated
	 */
	charAffectation createcharAffectation();

	/**
	 * Returns a new object of class '<em>string Affectation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>string Affectation</em>'.
	 * @generated
	 */
	stringAffectation createstringAffectation();

	/**
	 * Returns a new object of class '<em>write Console</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>write Console</em>'.
	 * @generated
	 */
	writeConsole createwriteConsole();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BehaviourMMPackage getBehaviourMMPackage();

} //BehaviourMMFactory
