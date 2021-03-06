package clang;
import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;
/**
 * <i>native declaration : src/main/c/clang-c/Index.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CXIdxCXXClassDeclInfo extends Structure {
	/// C type : const CXIdxDeclInfo*
	public clang.CXIdxDeclInfo.ByReference declInfo;
	/// C type : const CXIdxBaseClassInfo**
	public PointerByReference bases;
	public int numBases;
	public CXIdxCXXClassDeclInfo() {
		super();
		initFieldOrder();
	}
	protected void initFieldOrder() {
		setFieldOrder(new String[]{"declInfo", "bases", "numBases"});
	}
	/**
	 * @param declInfo C type : const CXIdxDeclInfo*<br>
	 * @param bases C type : const CXIdxBaseClassInfo**
	 */
	public CXIdxCXXClassDeclInfo(clang.CXIdxDeclInfo.ByReference declInfo, PointerByReference bases, int numBases) {
		super();
		this.declInfo = declInfo;
		this.bases = bases;
		this.numBases = numBases;
		initFieldOrder();
	}
	public static class ByReference extends CXIdxCXXClassDeclInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends CXIdxCXXClassDeclInfo implements Structure.ByValue {
		
	};
}
