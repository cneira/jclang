package clang;
import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;
/**
 * <i>native declaration : src/main/c/clang-c/Index.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CXIdxObjCProtocolRefListInfo extends Structure {
	/// C type : const CXIdxObjCProtocolRefInfo**
	public PointerByReference protocols;
	public int numProtocols;
	public CXIdxObjCProtocolRefListInfo() {
		super();
		initFieldOrder();
	}
	protected void initFieldOrder() {
		setFieldOrder(new String[]{"protocols", "numProtocols"});
	}
	/// @param protocols C type : const CXIdxObjCProtocolRefInfo**
	public CXIdxObjCProtocolRefListInfo(PointerByReference protocols, int numProtocols) {
		super();
		this.protocols = protocols;
		this.numProtocols = numProtocols;
		initFieldOrder();
	}
	public static class ByReference extends CXIdxObjCProtocolRefListInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends CXIdxObjCProtocolRefListInfo implements Structure.ByValue {
		
	};
}
