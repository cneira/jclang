package clang;
import com.sun.jna.Structure;
/**
 * <i>native declaration : src/main/c/clang-c/Index.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CXIdxObjCProtocolRefInfo extends Structure {
	/// C type : const CXIdxEntityInfo*
	public clang.CXIdxEntityInfo.ByReference protocol;
	/// C type : CXCursor
	public CXCursor cursor;
	/// C type : CXIdxLoc
	public CXIdxLoc loc;
	public CXIdxObjCProtocolRefInfo() {
		super();
		initFieldOrder();
	}
	protected void initFieldOrder() {
		setFieldOrder(new String[]{"protocol", "cursor", "loc"});
	}
	/**
	 * @param protocol C type : const CXIdxEntityInfo*<br>
	 * @param cursor C type : CXCursor<br>
	 * @param loc C type : CXIdxLoc
	 */
	public CXIdxObjCProtocolRefInfo(clang.CXIdxEntityInfo.ByReference protocol, CXCursor cursor, CXIdxLoc loc) {
		super();
		this.protocol = protocol;
		this.cursor = cursor;
		this.loc = loc;
		initFieldOrder();
	}
	public static class ByReference extends CXIdxObjCProtocolRefInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends CXIdxObjCProtocolRefInfo implements Structure.ByValue {
		
	};
}
