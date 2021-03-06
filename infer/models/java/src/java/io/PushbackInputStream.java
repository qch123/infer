package java.io;

import com.facebook.infer.models.InferUndefined;

public class PushbackInputStream extends FilterInputStream {

    public PushbackInputStream(InputStream in, int size) {
        super(in);
    }

    public PushbackInputStream(InputStream in) {
        super(in);
    }

    public int available() throws IOException {
        return InferUndefined.can_throw_ioexception_int();
    }

    public void close() throws IOException {
        super.close();
    }

    public int read() throws IOException {
        return InferUndefined.can_throw_ioexception_int();
    }

    public int read(byte b[]) throws IOException {
        return InferUndefined.can_throw_ioexception_int();
    }

    public int read(byte b[], int off, int len) throws IOException {
        return InferUndefined.can_throw_ioexception_int();
    }

    public void reset() throws IOException {
        InferUndefined.can_throw_ioexception_void();
    }

    public long skip(long n) throws IOException {
        return InferUndefined.can_throw_ioexception_long();
    }

    public void unread(byte[] b) throws IOException {
        InferUndefined.can_throw_ioexception_void();
    }

    public void unread(byte[] b, int off, int len) throws IOException {
        InferUndefined.can_throw_ioexception_void();
    }

    public void unread(int b) throws IOException {
        InferUndefined.can_throw_ioexception_void();
    }
}
