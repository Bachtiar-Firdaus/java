package belajar_java_validation.extractor;

import belajar_java_validation.container.Data;
import jakarta.validation.valueextraction.ExtractedValue;
import jakarta.validation.valueextraction.ValueExtractor;

public class DataValueExtractor implements ValueExtractor<Data<@ExtractedValue ?>> {

    @Override
    public void extractValues(Data<?> originalValue, ValueReceiver receiver) {
        Object data = originalValue.getData();
        receiver.value(null, data);
    }
}
