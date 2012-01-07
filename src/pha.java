import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jagdx.IDirect3DVertexBuffer;
import jagdx.fna;
import jaggl.OpenGL;
import java.io.IOException;
import java.io.InputStream;

final class pha extends InputStream {

   static int a;
   static int d;
   static int g;
   static Object[] e = null;
   static int c;
   static int f_i = 2;
   static int h;
   private Object[] b;
   static int f;


   static final Object[] a(Object[] var0, Object[] var1, boolean var2) {
      ++h;
      Class_is.b((byte)119, var0);
      if(var2) {
         var0[43] = (Object)null;
      }

      ji.a((byte)121, var0);
      var0[11] = var1;
      if(((boolean[])((boolean[])((Object[])((Object[])var0[11]))[17]))[0] && ((boolean[])((boolean[])((Object[])((Object[])var0[11]))[17]))[5]) {
         var0[7] = var0[9] = el.a(true, (Object[])((Object[])var0[11]), new Object[5]);
         if(((int[])((int[])((Object[])((Object[])var0[11]))[1]))[2] > 1 && ((boolean[])((boolean[])((Object[])((Object[])var0[11]))[17]))[25] && ((boolean[])((boolean[])((Object[])((Object[])var0[11]))[17]))[9]) {
            var0[7] = var0[5] = el.a(true, (Object[])((Object[])var0[11]), new Object[5]);
         }
      }

      return var0;
   }

   pha(Object[] var1) {
      this.b = var1;
   }

   static final void a(Object[] var0, int var1) {
      int var2 = -65 % ((var1 - 71) / 51);
      ((int[])((int[])var0[1]))[1] = 4;
      ++c;
      ((int[])((int[])var0[1]))[2] = 4;
   }

   public final int read() throws IOException {
      ++a;
      return rp.a(this.b, 104);
   }

   static final void a(int var0, int var1) {
      if(var1 >= -38) {
         a((Object[])null, ((int[])((int[])e[5]))[4]);
      }

      ++f;
      Object[] var2 = vi.e;
      synchronized(vi.e) {
         fua.a(-70, vi.e, var0);
      }
   }

   static final boolean a(int var0, int var1, Source var2, Object[] var3, int var4) {
      ++g;
      boolean var5;
      if(var3 != null && -10 == ~var3.length) {
         ((byte[])((byte[])var3[5]))[0] = (byte)var4;
         if(((int[])((int[])var3[1]))[2] >= var0) {
            if(-1 > ~((int[])((int[])var3[1]))[3]) {
               OpenGL.glBindBufferARB(((int[])((int[])var3[1]))[0], ((int[])((int[])var3[1]))[3]);
               OpenGL.glBufferSubDataARBa(((int[])((int[])var3[1]))[0], 0, ((int[])((int[])var3[1]))[1], var2.b());
               ((int[])((int[])((Object[])((Object[])var3[3]))[1]))[32] += var0 - ((int[])((int[])var3[1]))[1];
            } else {
               var3[2] = ho.a(var0, false, var1 ^ 46, (Object[])((Object[])var3[3]));
               ((NativeHeapBuffer)var3[2]).a(var2);
            }
         } else {
            kea.a(22771, var3);
            if(((int[])((int[])var3[1]))[3] <= 0) {
               var3[2] = ho.a(var0, false, 46, (Object[])((Object[])var3[3]));
               ((NativeHeapBuffer)var3[2]).a(var2);
            } else {
               OpenGL.glBindBufferARB(((int[])((int[])var3[1]))[0], ((int[])((int[])var3[1]))[3]);
               OpenGL.glBufferDataARBa(((int[])((int[])var3[1]))[0], var0, var2.b(), ((boolean[])((boolean[])var3[4]))[0]?'\u88e0':'\u88e4');
               ((int[])((int[])((Object[])((Object[])var3[3]))[1]))[32] += -((int[])((int[])var3[1]))[1] + var0;
            }

            ((int[])((int[])var3[1]))[2] = var0;
         }

         ((int[])((int[])var3[1]))[1] = var0;
         var5 = true;
         return var5;
      } else if(var1 != 0) {
         return ((boolean[])((boolean[])var3[5]))[1];
      } else if(var3 != null && -7 == ~var3.length) {
         if(!ema.a(var4, var0, var3, (byte)-29)) {
            var5 = false;
         } else {
            var5 = fna.a(IDirect3DVertexBuffer.Upload(((long[])((long[])var3[4]))[0], 0, ((int[])((int[])var3[1]))[1], !((boolean[])((boolean[])var3[2]))[0]?0:8192, var2.b()), (byte)-43);
         }

         return var5;
      } else {
         throw new IllegalStateException();
      }
   }

}
