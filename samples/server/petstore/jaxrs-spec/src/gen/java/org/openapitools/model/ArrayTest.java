package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ReadOnlyFirst;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ArrayTest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public class ArrayTest  implements Serializable {
  private @Valid List<String> arrayOfString = new ArrayList<>();
  private @Valid List<List<Long>> arrayArrayOfInteger = new ArrayList<>();
  private @Valid List<List<@Valid ReadOnlyFirst>> arrayArrayOfModel = new ArrayList<>();

  protected ArrayTest(ArrayTestBuilder<?, ?> b) {
    this.arrayOfString = b.arrayOfString;
    this.arrayArrayOfInteger = b.arrayArrayOfInteger;
    this.arrayArrayOfModel = b.arrayArrayOfModel;
  }

  public ArrayTest() {
  }

  /**
   **/
  public ArrayTest arrayOfString(List<String> arrayOfString) {
    this.arrayOfString = arrayOfString;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("array_of_string")
   @Size(min=0,max=3)public List<String> getArrayOfString() {
    return arrayOfString;
  }

  @JsonProperty("array_of_string")
  public void setArrayOfString(List<String> arrayOfString) {
    this.arrayOfString = arrayOfString;
  }

  public ArrayTest addArrayOfStringItem(String arrayOfStringItem) {
    if (this.arrayOfString == null) {
      this.arrayOfString = new ArrayList<>();
    }

    this.arrayOfString.add(arrayOfStringItem);
    return this;
  }

  public ArrayTest removeArrayOfStringItem(String arrayOfStringItem) {
    if (arrayOfStringItem != null && this.arrayOfString != null) {
      this.arrayOfString.remove(arrayOfStringItem);
    }

    return this;
  }
  /**
   **/
  public ArrayTest arrayArrayOfInteger(List<List<Long>> arrayArrayOfInteger) {
    this.arrayArrayOfInteger = arrayArrayOfInteger;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("array_array_of_integer")
  public List<List<Long>> getArrayArrayOfInteger() {
    return arrayArrayOfInteger;
  }

  @JsonProperty("array_array_of_integer")
  public void setArrayArrayOfInteger(List<List<Long>> arrayArrayOfInteger) {
    this.arrayArrayOfInteger = arrayArrayOfInteger;
  }

  public ArrayTest addArrayArrayOfIntegerItem(List<Long> arrayArrayOfIntegerItem) {
    if (this.arrayArrayOfInteger == null) {
      this.arrayArrayOfInteger = new ArrayList<>();
    }

    this.arrayArrayOfInteger.add(arrayArrayOfIntegerItem);
    return this;
  }

  public ArrayTest removeArrayArrayOfIntegerItem(List<Long> arrayArrayOfIntegerItem) {
    if (arrayArrayOfIntegerItem != null && this.arrayArrayOfInteger != null) {
      this.arrayArrayOfInteger.remove(arrayArrayOfIntegerItem);
    }

    return this;
  }
  /**
   **/
  public ArrayTest arrayArrayOfModel(List<List<@Valid ReadOnlyFirst>> arrayArrayOfModel) {
    this.arrayArrayOfModel = arrayArrayOfModel;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("array_array_of_model")
  @Valid public List<@Valid List<@Valid ReadOnlyFirst>> getArrayArrayOfModel() {
    return arrayArrayOfModel;
  }

  @JsonProperty("array_array_of_model")
  public void setArrayArrayOfModel(List<List<@Valid ReadOnlyFirst>> arrayArrayOfModel) {
    this.arrayArrayOfModel = arrayArrayOfModel;
  }

  public ArrayTest addArrayArrayOfModelItem(List<@Valid ReadOnlyFirst> arrayArrayOfModelItem) {
    if (this.arrayArrayOfModel == null) {
      this.arrayArrayOfModel = new ArrayList<>();
    }

    this.arrayArrayOfModel.add(arrayArrayOfModelItem);
    return this;
  }

  public ArrayTest removeArrayArrayOfModelItem(List<@Valid ReadOnlyFirst> arrayArrayOfModelItem) {
    if (arrayArrayOfModelItem != null && this.arrayArrayOfModel != null) {
      this.arrayArrayOfModel.remove(arrayArrayOfModelItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayTest arrayTest = (ArrayTest) o;
    return Objects.equals(this.arrayOfString, arrayTest.arrayOfString) &&
        Objects.equals(this.arrayArrayOfInteger, arrayTest.arrayArrayOfInteger) &&
        Objects.equals(this.arrayArrayOfModel, arrayTest.arrayArrayOfModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrayOfString, arrayArrayOfInteger, arrayArrayOfModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayTest {\n");
    
    sb.append("    arrayOfString: ").append(toIndentedString(arrayOfString)).append("\n");
    sb.append("    arrayArrayOfInteger: ").append(toIndentedString(arrayArrayOfInteger)).append("\n");
    sb.append("    arrayArrayOfModel: ").append(toIndentedString(arrayArrayOfModel)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static ArrayTestBuilder<?, ?> builder() {
    return new ArrayTestBuilderImpl();
  }

  private static final class ArrayTestBuilderImpl extends ArrayTestBuilder<ArrayTest, ArrayTestBuilderImpl> {

    @Override
    protected ArrayTestBuilderImpl self() {
      return this;
    }

    @Override
    public ArrayTest build() {
      return new ArrayTest(this);
    }
  }

  public static abstract class ArrayTestBuilder<C extends ArrayTest, B extends ArrayTestBuilder<C, B>>  {
    private List<String> arrayOfString = new ArrayList<>();
    private List<List<Long>> arrayArrayOfInteger = new ArrayList<>();
    private List<List<ReadOnlyFirst>> arrayArrayOfModel = new ArrayList<>();
    protected abstract B self();

    public abstract C build();

    public B arrayOfString(List<String> arrayOfString) {
      this.arrayOfString = arrayOfString;
      return self();
    }
    public B arrayArrayOfInteger(List<List<Long>> arrayArrayOfInteger) {
      this.arrayArrayOfInteger = arrayArrayOfInteger;
      return self();
    }
    public B arrayArrayOfModel(List<List<ReadOnlyFirst>> arrayArrayOfModel) {
      this.arrayArrayOfModel = arrayArrayOfModel;
      return self();
    }
  }
}

