package test.handlers;

import behaviourMM.Affectation;
import behaviourMM.Conditionnal;
import behaviourMM.Loop;
import behaviourMM.Operator;
import behaviourMM.Statement;
import behaviourMM.Variable;
import behaviourMM.additionOperator;
import behaviourMM.andOperator;
import behaviourMM.boolAffectation;
import behaviourMM.boolVariable;
import behaviourMM.charAffectation;
import behaviourMM.charVariable;
import behaviourMM.divisionOperator;
import behaviourMM.doubleAffectation;
import behaviourMM.doubleVariable;
import behaviourMM.elseConditionnal;
import behaviourMM.equalOperator;
import behaviourMM.forLoop;
import behaviourMM.ifConditionnal;
import behaviourMM.inferiorOperator;
import behaviourMM.inferiorOrEqualOperator;
import behaviourMM.intAffectation;
import behaviourMM.intVariable;
import behaviourMM.multiplicationOperator;
import behaviourMM.noOperator;
import behaviourMM.operationAffectation;
import behaviourMM.orOperator;
import behaviourMM.soustractionOperator;
import behaviourMM.stringAffectation;
import behaviourMM.stringVariable;
import behaviourMM.superiorOperator;
import behaviourMM.superiorOrEqualOperator;
import behaviourMM.variableAffectation;
import behaviourMM.writeConsole;
import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Conversions;
import structureMM.Attribute;
import structureMM.Method;
import structureMM.boolAttribute;
import structureMM.boolMethod;
import structureMM.charAttribute;
import structureMM.charMethod;
import structureMM.doubleAttribute;
import structureMM.doubleMethod;
import structureMM.intAttribute;
import structureMM.intMethod;
import structureMM.stringAttribute;
import structureMM.stringMethod;

@SuppressWarnings("all")
public class test implements IGenerator {
  public String getType(final Attribute a) {
    if ((a instanceof doubleAttribute)) {
      return "double";
    } else {
      if ((a instanceof intAttribute)) {
        return "int";
      } else {
        if ((a instanceof boolAttribute)) {
          return "bool";
        } else {
          if ((a instanceof charAttribute)) {
            return "char";
          } else {
            if ((a instanceof stringAttribute)) {
              return "string";
            }
          }
        }
      }
    }
    return null;
  }
  
  public String getType(final Method m) {
    if ((m instanceof doubleMethod)) {
      return "double";
    } else {
      if ((m instanceof intMethod)) {
        return "int";
      } else {
        if ((m instanceof boolMethod)) {
          return "bool";
        } else {
          if ((m instanceof charMethod)) {
            return "char";
          } else {
            if ((m instanceof stringMethod)) {
              return "string";
            }
          }
        }
      }
    }
    return null;
  }
  
  public String getInputs(final Method m) {
    StringBuffer buffer = new StringBuffer();
    for (int i = 0; (i < ((Object[])Conversions.unwrapArray(m.getInputs(), Object.class)).length); i++) {
      {
        EList<Attribute> _inputs = m.getInputs();
        Attribute _get = _inputs.get(i);
        String _type = this.getType(_get);
        buffer.append(_type);
        buffer.append(" ");
        EList<Attribute> _inputs_1 = m.getInputs();
        Attribute _get_1 = _inputs_1.get(i);
        String _name = _get_1.getName();
        buffer.append(_name);
        EList<Attribute> _inputs_2 = m.getInputs();
        int _length = ((Object[])Conversions.unwrapArray(_inputs_2, Object.class)).length;
        boolean _notEquals = (i != _length);
        if (_notEquals) {
          buffer.append(", ");
        }
      }
    }
    return buffer.toString();
  }
  
  public String getType(final Variable v) {
    if ((v instanceof doubleVariable)) {
      return "double";
    } else {
      if ((v instanceof intVariable)) {
        return "int";
      } else {
        if ((v instanceof boolVariable)) {
          return "bool";
        } else {
          if ((v instanceof charVariable)) {
            return "char";
          } else {
            if ((v instanceof stringVariable)) {
              return "string";
            }
          }
        }
      }
    }
    return null;
  }
  
  public Object getFor(final forLoop f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for(");
    Affectation _startValue = f.getStartValue();
    _builder.append(_startValue, "\t");
    _builder.append(", ");
    Operator _iteration = f.getIteration();
    _builder.append(_iteration, "\t");
    _builder.append(", ");
    Operator _conditionStop = f.getConditionStop();
    _builder.append(_conditionStop, "\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<Statement> _statement = f.getStatement();
      for(final Statement s : _statement) {
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        Object _statements = this.getStatements(s);
        _builder.append(_statements, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public Object getLoop(final Loop l) {
    Object _xifexpression = null;
    if ((l instanceof forLoop)) {
      _xifexpression = this.getFor(((forLoop)l));
    }
    return _xifexpression;
  }
  
  public String getEqual(final equalOperator e) {
    Variable _element1 = e.getElement1();
    String _name = _element1.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      Variable _element2 = e.getElement2();
      String _name_1 = _element2.getName();
      boolean _notEquals_1 = (!Objects.equal(_name_1, null));
      if (_notEquals_1) {
        return "«i.receivedOperation.element1.name» == «i.receivedOperation.element2.name»";
      }
      return "«i.receivedOperation.element1.name» == «i.receivedOperation.element2.value»";
    }
    return "«i.receivedOperation.element1.value» == «i.receivedOperation.element2.value»";
  }
  
  public String getInferior(final inferiorOperator i) {
    Variable _element1 = i.getElement1();
    String _name = _element1.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      Variable _element2 = i.getElement2();
      String _name_1 = _element2.getName();
      boolean _notEquals_1 = (!Objects.equal(_name_1, null));
      if (_notEquals_1) {
        return "«i.receivedOperation.element1.name» < «i.receivedOperation.element2.name»";
      }
      return "«i.receivedOperation.element1.name» < «i.receivedOperation.element2.value»";
    }
    return "«i.receivedOperation.element1.value» < «i.receivedOperation.element2.value»";
  }
  
  public String getSuperior(final superiorOperator s) {
    Variable _element1 = s.getElement1();
    String _name = _element1.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      Variable _element2 = s.getElement2();
      String _name_1 = _element2.getName();
      boolean _notEquals_1 = (!Objects.equal(_name_1, null));
      if (_notEquals_1) {
        return "«i.receivedOperation.element1.name» > «i.receivedOperation.element2.name»";
      }
      return "«i.receivedOperation.element1.name» > «i.receivedOperation.element2.value»";
    }
    return "«i.receivedOperation.element1.value» > «i.receivedOperation.element2.value»";
  }
  
  public String getSuperiorOrEqual(final superiorOrEqualOperator s) {
    Variable _element1 = s.getElement1();
    String _name = _element1.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      Variable _element2 = s.getElement2();
      String _name_1 = _element2.getName();
      boolean _notEquals_1 = (!Objects.equal(_name_1, null));
      if (_notEquals_1) {
        return "«i.receivedOperation.element1.name» >= «i.receivedOperation.element2.name»";
      }
      return "«i.receivedOperation.element1.name» >= «i.receivedOperation.element2.value»";
    }
    return "«i.receivedOperation.element1.value» >= «i.receivedOperation.element2.value»";
  }
  
  public String getInferiorOrEqual(final inferiorOrEqualOperator i) {
    Variable _element1 = i.getElement1();
    String _name = _element1.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      Variable _element2 = i.getElement2();
      String _name_1 = _element2.getName();
      boolean _notEquals_1 = (!Objects.equal(_name_1, null));
      if (_notEquals_1) {
        return "«i.receivedOperation.element1.name» <= «i.receivedOperation.element2.name»";
      }
      return "«i.receivedOperation.element1.name» <= «i.receivedOperation.element2.value»";
    }
    return "«i.receivedOperation.element1.value» <= «i.receivedOperation.element2.value»";
  }
  
  public String getOr(final orOperator o) {
    Variable _element1 = o.getElement1();
    String _name = _element1.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      Variable _element2 = o.getElement2();
      String _name_1 = _element2.getName();
      boolean _notEquals_1 = (!Objects.equal(_name_1, null));
      if (_notEquals_1) {
        return "«i.receivedOperation.element1.name» || «i.receivedOperation.element2.name»";
      }
      return "«i.receivedOperation.element1.name» || «i.receivedOperation.element2.value»";
    }
    return "«i.receivedOperation.element1.value» || «i.receivedOperation.element2.value»";
  }
  
  public String getAnd(final andOperator a) {
    Variable _element1 = a.getElement1();
    String _name = _element1.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      Variable _element2 = a.getElement2();
      String _name_1 = _element2.getName();
      boolean _notEquals_1 = (!Objects.equal(_name_1, null));
      if (_notEquals_1) {
        return "«i.receivedOperation.element1.name» && «i.receivedOperation.element2.name»";
      }
      return "«i.receivedOperation.element1.name» && «i.receivedOperation.element2.value»";
    }
    return "«i.receivedOperation.element1.value» && «i.receivedOperation.element2.value»";
  }
  
  public String getNo(final noOperator e) {
    Variable _element1 = e.getElement1();
    String _name = _element1.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      return "!(«i.receivedOperation.element1.name»)";
    }
    return "!(«i.receivedOperation.element1.value»)";
  }
  
  public StringBuffer getCondition(final ifConditionnal i) {
    StringBuffer _xblockexpression = null;
    {
      StringBuffer buffer = new StringBuffer();
      StringBuffer _xifexpression = null;
      Operator _condition = i.getCondition();
      if ((_condition instanceof equalOperator)) {
        Operator _condition_1 = i.getCondition();
        String _equal = this.getEqual(((equalOperator) _condition_1));
        _xifexpression = buffer.append(_equal);
      } else {
        StringBuffer _xifexpression_1 = null;
        Operator _condition_2 = i.getCondition();
        if ((_condition_2 instanceof inferiorOperator)) {
          Operator _condition_3 = i.getCondition();
          String _inferior = this.getInferior(((inferiorOperator) _condition_3));
          _xifexpression_1 = buffer.append(_inferior);
        } else {
          StringBuffer _xifexpression_2 = null;
          Operator _condition_4 = i.getCondition();
          if ((_condition_4 instanceof superiorOperator)) {
            Operator _condition_5 = i.getCondition();
            String _superior = this.getSuperior(((superiorOperator) _condition_5));
            _xifexpression_2 = buffer.append(_superior);
          } else {
            StringBuffer _xifexpression_3 = null;
            Operator _condition_6 = i.getCondition();
            if ((_condition_6 instanceof superiorOrEqualOperator)) {
              Operator _condition_7 = i.getCondition();
              String _superiorOrEqual = this.getSuperiorOrEqual(((superiorOrEqualOperator) _condition_7));
              _xifexpression_3 = buffer.append(_superiorOrEqual);
            } else {
              StringBuffer _xifexpression_4 = null;
              Operator _condition_8 = i.getCondition();
              if ((_condition_8 instanceof inferiorOrEqualOperator)) {
                Operator _condition_9 = i.getCondition();
                String _inferiorOrEqual = this.getInferiorOrEqual(((inferiorOrEqualOperator) _condition_9));
                _xifexpression_4 = buffer.append(_inferiorOrEqual);
              } else {
                StringBuffer _xifexpression_5 = null;
                Operator _condition_10 = i.getCondition();
                if ((_condition_10 instanceof orOperator)) {
                  Operator _condition_11 = i.getCondition();
                  String _or = this.getOr(((orOperator) _condition_11));
                  _xifexpression_5 = buffer.append(_or);
                } else {
                  StringBuffer _xifexpression_6 = null;
                  Operator _condition_12 = i.getCondition();
                  if ((_condition_12 instanceof andOperator)) {
                    Operator _condition_13 = i.getCondition();
                    String _and = this.getAnd(((andOperator) _condition_13));
                    _xifexpression_6 = buffer.append(_and);
                  } else {
                    StringBuffer _xifexpression_7 = null;
                    Operator _condition_14 = i.getCondition();
                    if ((_condition_14 instanceof noOperator)) {
                      Operator _condition_15 = i.getCondition();
                      String _no = this.getNo(((noOperator) _condition_15));
                      _xifexpression_7 = buffer.append(_no);
                    }
                    _xifexpression_6 = _xifexpression_7;
                  }
                  _xifexpression_5 = _xifexpression_6;
                }
                _xifexpression_4 = _xifexpression_5;
              }
              _xifexpression_3 = _xifexpression_4;
            }
            _xifexpression_2 = _xifexpression_3;
          }
          _xifexpression_1 = _xifexpression_2;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public CharSequence writeElse(final elseConditionnal e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("else {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Statement> _statement = e.getStatement();
      for(final Statement s : _statement) {
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("    \t\t\t");
        Object _statements = this.getStatements(s);
        _builder.append(_statements, "    \t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence getElse(final ifConditionnal i) {
    CharSequence _xifexpression = null;
    elseConditionnal _elseC = i.getElseC();
    boolean _notEquals = (!Objects.equal(_elseC, null));
    if (_notEquals) {
      elseConditionnal _elseC_1 = i.getElseC();
      _xifexpression = this.writeElse(_elseC_1);
    }
    return _xifexpression;
  }
  
  public CharSequence getIf(final ifConditionnal i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (");
    StringBuffer _condition = this.getCondition(i);
    _builder.append(_condition, "\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<Statement> _statement = i.getStatement();
      for(final Statement s : _statement) {
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        Object _statements = this.getStatements(i);
        _builder.append(_statements, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} ");
    CharSequence _else = this.getElse(i);
    _builder.append(_else, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence getConditionnal(final Conditionnal c) {
    CharSequence _xifexpression = null;
    if ((c instanceof ifConditionnal)) {
      _xifexpression = this.getIf(((ifConditionnal)c));
    }
    return _xifexpression;
  }
  
  public String getAddition(final additionOperator a) {
    Variable _element1 = a.getElement1();
    String _name = _element1.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      Variable _element2 = a.getElement2();
      String _name_1 = _element2.getName();
      boolean _notEquals_1 = (!Objects.equal(_name_1, null));
      if (_notEquals_1) {
        return "o.receivingVariable.name» = «o.receivedOperation.element1.name» + «o.receivedOperation.element2.name";
      }
      return "o.receivingVariable.name» = «o.receivedOperation.element1.name» + «o.receivedOperation.element2.value";
    }
    return "o.receivingVariable.name» = «o.receivedOperation.element1.value» + «o.receivedOperation.element2.value";
  }
  
  public String getSoustraction(final soustractionOperator s) {
    Variable _element1 = s.getElement1();
    String _name = _element1.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      Variable _element2 = s.getElement2();
      String _name_1 = _element2.getName();
      boolean _notEquals_1 = (!Objects.equal(_name_1, null));
      if (_notEquals_1) {
        return "o.receivingVariable.name» = «o.receivedOperation.element1.name» - «o.receivedOperation.element2.name";
      }
      return "o.receivingVariable.name» = «o.receivedOperation.element1.name» - «o.receivedOperation.element2.value";
    }
    return "o.receivingVariable.name» = «o.receivedOperation.element1.value» - «o.receivedOperation.element2.value";
  }
  
  public String getMultiplication(final multiplicationOperator m) {
    Variable _element1 = m.getElement1();
    String _name = _element1.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      Variable _element2 = m.getElement2();
      String _name_1 = _element2.getName();
      boolean _notEquals_1 = (!Objects.equal(_name_1, null));
      if (_notEquals_1) {
        return "o.receivingVariable.name» = «o.receivedOperation.element1.name» * «o.receivedOperation.element2.name";
      }
      return "o.receivingVariable.name» = «o.receivedOperation.element1.name» * «o.receivedOperation.element2.value";
    }
    return "o.receivingVariable.name» = «o.receivedOperation.element1.value» * «o.receivedOperation.element2.value";
  }
  
  public String getDivision(final divisionOperator d) {
    Variable _element1 = d.getElement1();
    String _name = _element1.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      Variable _element2 = d.getElement2();
      String _name_1 = _element2.getName();
      boolean _notEquals_1 = (!Objects.equal(_name_1, null));
      if (_notEquals_1) {
        return "o.receivingVariable.name» = «o.receivedOperation.element1.name» / «o.receivedOperation.element2.name";
      }
      return "o.receivingVariable.name» = «o.receivedOperation.element1.name» / «o.receivedOperation.element2.value";
    }
    return "o.receivingVariable.name» = «o.receivedOperation.element1.value» / «o.receivedOperation.element2.value";
  }
  
  public StringBuilder getOperationAff(final operationAffectation o) {
    StringBuilder buffer = new StringBuilder();
    if ((o instanceof additionOperator)) {
      String _addition = this.getAddition(((additionOperator)o));
      buffer.append(_addition);
    } else {
      if ((o instanceof soustractionOperator)) {
        String _soustraction = this.getSoustraction(((soustractionOperator)o));
        buffer.append(_soustraction);
      } else {
        if ((o instanceof multiplicationOperator)) {
          String _multiplication = this.getMultiplication(((multiplicationOperator)o));
          buffer.append(_multiplication);
        } else {
          if ((o instanceof divisionOperator)) {
            String _division = this.getDivision(((divisionOperator)o));
            buffer.append(_division);
          }
        }
      }
    }
    return buffer;
  }
  
  public CharSequence getIntAff(final intAffectation i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t");
    Variable _receivingVariable = i.getReceivingVariable();
    _builder.append(_receivingVariable, "\t");
    _builder.append(" = ");
    int _receivedInt = i.getReceivedInt();
    String _string = Integer.valueOf(_receivedInt).toString();
    _builder.append(_string, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence getDoubleAff(final doubleAffectation d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t");
    Variable _receivingVariable = d.getReceivingVariable();
    _builder.append(_receivingVariable, "\t");
    _builder.append(" = ");
    double _receivedDouble = d.getReceivedDouble();
    String _string = Double.valueOf(_receivedDouble).toString();
    _builder.append(_string, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence getBoolAff(final boolAffectation b) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t");
    Variable _receivingVariable = b.getReceivingVariable();
    _builder.append(_receivingVariable, "\t");
    _builder.append(" = ");
    boolean _isReceivedBool = b.isReceivedBool();
    String _string = Boolean.valueOf(_isReceivedBool).toString();
    _builder.append(_string, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence getCharAff(final charAffectation c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t");
    Variable _receivingVariable = c.getReceivingVariable();
    _builder.append(_receivingVariable, "\t");
    _builder.append(" = ");
    char _receivedChar = c.getReceivedChar();
    String _string = Character.valueOf(_receivedChar).toString();
    _builder.append(_string, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence getStringAff(final stringAffectation s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t");
    Variable _receivingVariable = s.getReceivingVariable();
    _builder.append(_receivingVariable, "\t");
    _builder.append(" = ");
    String _receivedString = s.getReceivedString();
    _builder.append(_receivedString, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence getVariableAff(final variableAffectation v) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t");
    Variable _receivingVariable = v.getReceivingVariable();
    String _name = _receivingVariable.getName();
    _builder.append(_name, "\t");
    _builder.append(" = ");
    Variable _receivedVariable = v.getReceivedVariable();
    String _name_1 = _receivedVariable.getName();
    _builder.append(_name_1, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence getAffectation(final Affectation a) {
    CharSequence _xifexpression = null;
    if ((a instanceof operationAffectation)) {
      _xifexpression = this.getOperationAff(((operationAffectation)a));
    } else {
      CharSequence _xifexpression_1 = null;
      if ((a instanceof intAffectation)) {
        _xifexpression_1 = this.getIntAff(((intAffectation)a));
      } else {
        CharSequence _xifexpression_2 = null;
        if ((a instanceof boolAffectation)) {
          _xifexpression_2 = this.getBoolAff(((boolAffectation)a));
        } else {
          CharSequence _xifexpression_3 = null;
          if ((a instanceof charAffectation)) {
            _xifexpression_3 = this.getCharAff(((charAffectation)a));
          } else {
            CharSequence _xifexpression_4 = null;
            if ((a instanceof stringAffectation)) {
              _xifexpression_4 = this.getStringAff(((stringAffectation)a));
            } else {
              CharSequence _xifexpression_5 = null;
              if ((a instanceof doubleAffectation)) {
                _xifexpression_5 = this.getDoubleAff(((doubleAffectation)a));
              } else {
                CharSequence _xifexpression_6 = null;
                if ((a instanceof variableAffectation)) {
                  _xifexpression_6 = this.getVariableAff(((variableAffectation)a));
                }
                _xifexpression_5 = _xifexpression_6;
              }
              _xifexpression_4 = _xifexpression_5;
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public Object getConsole(final writeConsole w) {
    return null;
  }
  
  public CharSequence writeConsole(final writeConsole w) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("System.Out.println(\"");
    Object _console = this.getConsole(w);
    _builder.append(_console, "\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence getVariable(final Statement s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    {
      if ((s instanceof Variable)) {
        _builder.append("\t");
        String _type = this.getType(((Variable) s));
        _builder.append(_type, "\t");
        _builder.append(" ");
        String _name = ((Variable)s).getName();
        _builder.append(_name, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    return _builder;
  }
  
  public Object getStatements(final Statement s) {
    Object _xifexpression = null;
    if ((s instanceof Loop)) {
      _xifexpression = this.getLoop(((Loop)s));
    } else {
      CharSequence _xifexpression_1 = null;
      if ((s instanceof Conditionnal)) {
        _xifexpression_1 = this.getConditionnal(((Conditionnal)s));
      } else {
        CharSequence _xifexpression_2 = null;
        if ((s instanceof Affectation)) {
          _xifexpression_2 = this.getAffectation(((Affectation)s));
        } else {
          CharSequence _xifexpression_3 = null;
          if ((s instanceof writeConsole)) {
            _xifexpression_3 = this.writeConsole(((writeConsole)s));
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public CharSequence compile(final structureMM.Class c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _name = c.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _name_1 = c.getName();
    _builder.append(_name_1, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Attribute> _attributes = c.getAttributes();
      for(final Attribute a : _attributes) {
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// Attributes");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("public ");
        String _type = this.getType(a);
        _builder.append(_type, "\t\t");
        _builder.append(" ");
        String _name_2 = a.getName();
        _builder.append(_name_2, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Method> _methods = c.getMethods();
      for(final Method m : _methods) {
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("// Methods");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ");
        String _type_1 = this.getType(m);
        _builder.append(_type_1, "\t");
        _builder.append(" ");
        String _name_3 = m.getName();
        _builder.append(_name_3, "\t");
        _builder.append(" (");
        String _inputs = this.getInputs(m);
        _builder.append(_inputs, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// Declaration");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        {
          EList<Statement> _statement = m.getStatement();
          for(final Statement s : _statement) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            CharSequence _variable = this.getVariable(s);
            _builder.append(_variable, "\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// Body");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        {
          EList<Statement> _statement_1 = m.getStatement();
          for(final Statement s_1 : _statement_1) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            Object _statements = this.getStatements(s_1);
            _builder.append(_statements, "\t\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  public static Object main(final String[] args) {
    return null;
  }
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
