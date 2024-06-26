package top.dreamlike.panama.generator.test.struct;

import top.dreamlike.panama.generator.annotation.NativeArrayMark;
import top.dreamlike.panama.generator.annotation.Pointer;
import top.dreamlike.panama.generator.annotation.Union;
import top.dreamlike.panama.generator.proxy.NativeArray;

public class TestContainer {
    int size;
    Person single;

    @Pointer
    Person ptr;

    UnionStruct unionStruct;

    @NativeArrayMark(size = Person.class, length = 3)
    NativeArray<Person> personArray;

    @NativeArrayMark(size = Person.class, length = 5, asPointer = true)
    NativeArray<Person> arrayButPointer;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Person getSingle() {
        return single;
    }

    public void setSingle(Person single) {
        this.single = single;
    }

    public UnionStruct getUnionStruct() {
        return unionStruct;
    }

    public void setUnionStruct(UnionStruct unionStruct) {
        this.unionStruct = unionStruct;
    }

    public NativeArray<Person> getPersonArray() {
        return personArray;
    }

    public Person getPtr() {
        return ptr;
    }

    public void setPtr(Person ptr) {
        this.ptr = ptr;
    }

    public void setPersonArray(NativeArray<Person> personArray) {
        this.personArray = personArray;
    }

    public NativeArray<Person> getArrayButPointer() {
        return arrayButPointer;
    }

    public void setArrayButPointer(NativeArray<Person> arrayButPointer) {
        this.arrayButPointer = arrayButPointer;
    }

    @Union
    public static class UnionStruct {
        int union_a;
        long union_b;

        public int getUnion_a() {
            return union_a;
        }

        public void setUnion_a(int union_a) {
            this.union_a = union_a;
        }

        public long getUnion_b() {
            return union_b;
        }

        public void setUnion_b(long union_b) {
            this.union_b = union_b;
        }
    }
}