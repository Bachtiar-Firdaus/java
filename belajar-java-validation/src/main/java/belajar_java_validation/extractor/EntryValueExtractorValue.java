package belajar_java_validation.extractor;

import belajar_java_validation.container.Entry;
import jakarta.validation.valueextraction.ExtractedValue;
import jakarta.validation.valueextraction.ValueExtractor;

public class EntryValueExtractorValue implements ValueExtractor<Entry<?,@ExtractedValue ?>> {


    @Override
    public void extractValues(Entry<?, ?> entry, ValueReceiver valueReceiver) {
        valueReceiver.keyedValue(null, "value", entry.getValue());
    }
}
