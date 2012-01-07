import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;

final class tb {

   static int f;
   static int g;
   static int b;
   static int h;
   static int c;
   static int a;
   static int f_i;
   static int e;
   static int d;


   static final void a(Object[] var0, boolean var1, ta var2) {
      ++e;
      ya var3 = null;
      Object[] var4;
      if(null == var0[20] && ((boolean[])((boolean[])var0[8]))[5]) {
         var4 = qaa.a(262144, 1, var0, var2, true);
         var3 = (ya)(var4 != null?var4[0]:null);
      } else {
         var3 = (ya)var0[20];
         var0[20] = null;
      }

      var4 = (Object[])((Object[])woa.a(5, var0)[1]);
      if(!var1) {
         if(null != var3) {
            wg.a(var3, ((byte[])((byte[])var0[10]))[1], (int)((float[])((float[])var4[1]))[2], (int)((float[])((float[])var4[1]))[1], (boolean[])null);
         }

      }
   }

   static final boolean a(Object[] var0, Object[] var1, int var2) {
      ++h;
      if(var1 == var0[7]) {
         return true;
      } else if(!ui.f(var1, -35)) {
         return false;
      } else {
         boolean var3 = cna.a((int)-19031, var0);
         var0[var2] = var1;
         ((int[])((int[])var0[1]))[2] = Class_cs.a(var0, 3, var1);
         if(((int[])((int[])var0[1]))[2] == -1) {
            throw new IllegalArgumentException();
         } else {
            ((int[])((int[])var0[1]))[3] = ((int[])((int[])((Object[])((Object[])var0[7]))[4]))[1];
            if(var3) {
               OpenGL.glUseProgram(((int[])((int[])var0[1]))[3]);
               ((Object[])((Object[])var0[6]))[79] = var0[7];
            }

            return true;
         }
      }
   }

   static final int a(int var0, int var1, Object[] var2) {
      ++f;
      if(0 != var0 && 2 == dua.a((Object[])((Object[])((Object[])((Object[])var2[0]))[35]), (byte)-78)) {
         return 3;
      } else {
         int var3 = 12 % ((var1 - 84) / 36);
         return var0 != 0 && 1 != cf.a((int)-105, (Object[])((Object[])((Object[])((Object[])var2[0]))[3]))?2:1;
      }
   }

   static final Object[] b(Object[] var0, int var1, int var2) {
      ++d;
      if(var2 <= 53) {
         return (Object[])null;
      } else {
         dga.a(var0, (byte)67);
         ((int[])((int[])var0[1]))[0] = var1;
         return var0;
      }
   }

   static final boolean a(int var0, int var1, int var2) {
      ++b;
      boolean var3 = 0 != (var2 & 2048);
      if(var3) {
         if(var0 <= 6) {
            return true;
         } else if(!(Class_a.a((byte)-27, var1, var2) | -1 != ~('\u9000' & var2) | tqa.a(var1, -63, var2))) {
            boolean var4 = (var1 & 55) == 0;
            boolean var5 = ns.a(var2, (byte)85, var1) | -1 != ~(var2 & 8192);
            boolean var6 = 0 != (var2 & 65536);
            return var4 & (var6 | var5);
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   static final void a(boolean var0) {
      ++bi.j;
      ++a;
      Object[] var1 = ona.a((byte)120, (Object[])((Object[])lba.f[7]), db.e);
      ek.putByte((Object[])((Object[])var1[0]), afa.b((byte)-85));
      eda.a((byte)77, (Object[])((Object[])var1[0]), wr.n);
      eda.a((byte)74, (Object[])((Object[])var1[0]), nma.a);
      ek.putByte((Object[])((Object[])var1[0]), kea.b(59, (Object[])((Object[])tu.d[37])));
      if(!var0) {
         lj.a(var1, 6, lba.f);
      }
   }

   static final void newIAS3I1Wrapper(Object[] var1) {
      ++f_i;
      if(var1[1] == null) {
         var1[1] = new int[3];
      }
   }

   static final int a(Object[] var0, int var1, int var2) {
      if(var1 != 1) {
         ((boolean[])((boolean[])var0[0]))[0] = true;
      }

      ++g;
      return 1;
   }

   static final void a(Object[] var0, int var1) {
      ++c;
      ((NativeHeap)var0[var1]).a();
   }

}
