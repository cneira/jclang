package clang;
import com.sun.jna.Structure;
/**
 * <i>native declaration : src/main/c/clang-c/Index.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CXIdxIBOutletCollectionAttrInfo extends Structure {
	/// C type : const CXIdxAttrInfo*
	public clang.CXIdxAttrInfo.ByReference attrInfo;
	/// C type : const CXIdxEntityInfo*
	public clang.CXIdxEntityInfo.ByReference objcClass;
	/// C type : CXCursor
	public CXCursor classCursor;
	/// C type : CXIdxLoc
	public CXIdxLoc classLoc;
	public CXIdxIBOutletCollectionAttrInfo() {
		super();
		initFieldOrder();
	}
	protected void initFieldOrder() {
		setFieldOrder(new String[]{"attrInfo", "objcClass", "classCursor", "classLoc"});
	}
	/**
	 * @param attrInfo C type : const CXIdxAttrInfo*<br>
	 * @param objcClass C type : const CXIdxEntityInfo*<br>
	 * @param classCursor C type : CXCursor<br>
	 * @param classLoc C type : CXIdxLoc
	 */
	public CXIdxIBOutletCollectionAttrInfo(clang.CXIdxAttrInfo.ByReference attrInfo, clang.CXIdxEntityInfo.ByReference objcClass, CXCursor classCursor, CXIdxLoc classLoc) {
		super();
		this.attrInfo = attrInfo;
		this.objcClass = objcClass;
		this.classCursor = classCursor;
		this.classLoc = classLoc;
		initFieldOrder();
	}
	public static class ByReference extends CXIdxIBOutletCollectionAttrInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends CXIdxIBOutletCollectionAttrInfo implements Structure.ByValue {
		
	};
}
