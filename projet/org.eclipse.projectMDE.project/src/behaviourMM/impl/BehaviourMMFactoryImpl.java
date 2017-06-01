/**
 */
package behaviourMM.impl;

import behaviourMM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviourMMFactoryImpl extends EFactoryImpl implements BehaviourMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviourMMFactory init() {
		try {
			BehaviourMMFactory theBehaviourMMFactory = (BehaviourMMFactory)EPackage.Registry.INSTANCE.getEFactory(BehaviourMMPackage.eNS_URI);
			if (theBehaviourMMFactory != null) {
				return theBehaviourMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BehaviourMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourMMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BehaviourMMPackage.FOR_LOOP: return createforLoop();
			case BehaviourMMPackage.ADDITION_OPERATOR: return createadditionOperator();
			case BehaviourMMPackage.SOUSTRACTION_OPERATOR: return createsoustractionOperator();
			case BehaviourMMPackage.MULTIPLICATION_OPERATOR: return createmultiplicationOperator();
			case BehaviourMMPackage.DIVISION_OPERATOR: return createdivisionOperator();
			case BehaviourMMPackage.EQUAL_OPERATOR: return createequalOperator();
			case BehaviourMMPackage.INFERIOR_OPERATOR: return createinferiorOperator();
			case BehaviourMMPackage.SUPERIOR_OPERATOR: return createsuperiorOperator();
			case BehaviourMMPackage.INFERIOR_OR_EQUAL_OPERATOR: return createinferiorOrEqualOperator();
			case BehaviourMMPackage.SUPERIOR_OR_EQUAL_OPERATOR: return createsuperiorOrEqualOperator();
			case BehaviourMMPackage.AND_OPERATOR: return createandOperator();
			case BehaviourMMPackage.OR_OPERATOR: return createorOperator();
			case BehaviourMMPackage.NO_OPERATOR: return createnoOperator();
			case BehaviourMMPackage.INT_VARIABLE: return createintVariable();
			case BehaviourMMPackage.DOUBLE_VARIABLE: return createdoubleVariable();
			case BehaviourMMPackage.BOOL_VARIABLE: return createboolVariable();
			case BehaviourMMPackage.CHAR_VARIABLE: return createcharVariable();
			case BehaviourMMPackage.STRING_VARIABLE: return createstringVariable();
			case BehaviourMMPackage.IF_CONDITIONNAL: return createifConditionnal();
			case BehaviourMMPackage.ELSE_CONDITIONNAL: return createelseConditionnal();
			case BehaviourMMPackage.OPERATION_AFFECTATION: return createoperationAffectation();
			case BehaviourMMPackage.VARIABLE_AFFECTATION: return createvariableAffectation();
			case BehaviourMMPackage.INT_AFFECTATION: return createintAffectation();
			case BehaviourMMPackage.DOUBLE_AFFECTATION: return createdoubleAffectation();
			case BehaviourMMPackage.BOOL_AFFECTATION: return createboolAffectation();
			case BehaviourMMPackage.CHAR_AFFECTATION: return createcharAffectation();
			case BehaviourMMPackage.STRING_AFFECTATION: return createstringAffectation();
			case BehaviourMMPackage.WRITE_CONSOLE: return createwriteConsole();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public forLoop createforLoop() {
		forLoopImpl forLoop = new forLoopImpl();
		return forLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public additionOperator createadditionOperator() {
		additionOperatorImpl additionOperator = new additionOperatorImpl();
		return additionOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public soustractionOperator createsoustractionOperator() {
		soustractionOperatorImpl soustractionOperator = new soustractionOperatorImpl();
		return soustractionOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public multiplicationOperator createmultiplicationOperator() {
		multiplicationOperatorImpl multiplicationOperator = new multiplicationOperatorImpl();
		return multiplicationOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public divisionOperator createdivisionOperator() {
		divisionOperatorImpl divisionOperator = new divisionOperatorImpl();
		return divisionOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public equalOperator createequalOperator() {
		equalOperatorImpl equalOperator = new equalOperatorImpl();
		return equalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public inferiorOperator createinferiorOperator() {
		inferiorOperatorImpl inferiorOperator = new inferiorOperatorImpl();
		return inferiorOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public superiorOperator createsuperiorOperator() {
		superiorOperatorImpl superiorOperator = new superiorOperatorImpl();
		return superiorOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public inferiorOrEqualOperator createinferiorOrEqualOperator() {
		inferiorOrEqualOperatorImpl inferiorOrEqualOperator = new inferiorOrEqualOperatorImpl();
		return inferiorOrEqualOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public superiorOrEqualOperator createsuperiorOrEqualOperator() {
		superiorOrEqualOperatorImpl superiorOrEqualOperator = new superiorOrEqualOperatorImpl();
		return superiorOrEqualOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public andOperator createandOperator() {
		andOperatorImpl andOperator = new andOperatorImpl();
		return andOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public orOperator createorOperator() {
		orOperatorImpl orOperator = new orOperatorImpl();
		return orOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public noOperator createnoOperator() {
		noOperatorImpl noOperator = new noOperatorImpl();
		return noOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public intVariable createintVariable() {
		intVariableImpl intVariable = new intVariableImpl();
		return intVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public doubleVariable createdoubleVariable() {
		doubleVariableImpl doubleVariable = new doubleVariableImpl();
		return doubleVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolVariable createboolVariable() {
		boolVariableImpl boolVariable = new boolVariableImpl();
		return boolVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public charVariable createcharVariable() {
		charVariableImpl charVariable = new charVariableImpl();
		return charVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public stringVariable createstringVariable() {
		stringVariableImpl stringVariable = new stringVariableImpl();
		return stringVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ifConditionnal createifConditionnal() {
		ifConditionnalImpl ifConditionnal = new ifConditionnalImpl();
		return ifConditionnal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public elseConditionnal createelseConditionnal() {
		elseConditionnalImpl elseConditionnal = new elseConditionnalImpl();
		return elseConditionnal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public operationAffectation createoperationAffectation() {
		operationAffectationImpl operationAffectation = new operationAffectationImpl();
		return operationAffectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public variableAffectation createvariableAffectation() {
		variableAffectationImpl variableAffectation = new variableAffectationImpl();
		return variableAffectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public intAffectation createintAffectation() {
		intAffectationImpl intAffectation = new intAffectationImpl();
		return intAffectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public doubleAffectation createdoubleAffectation() {
		doubleAffectationImpl doubleAffectation = new doubleAffectationImpl();
		return doubleAffectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolAffectation createboolAffectation() {
		boolAffectationImpl boolAffectation = new boolAffectationImpl();
		return boolAffectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public charAffectation createcharAffectation() {
		charAffectationImpl charAffectation = new charAffectationImpl();
		return charAffectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public stringAffectation createstringAffectation() {
		stringAffectationImpl stringAffectation = new stringAffectationImpl();
		return stringAffectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public writeConsole createwriteConsole() {
		writeConsoleImpl writeConsole = new writeConsoleImpl();
		return writeConsole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourMMPackage getBehaviourMMPackage() {
		return (BehaviourMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BehaviourMMPackage getPackage() {
		return BehaviourMMPackage.eINSTANCE;
	}

} //BehaviourMMFactoryImpl
