import jagdx.D3DCAPS;
import jaggl.OpenGL;

final class ida extends gv {

   private Object[] r;
   static int A;
   static int o;
   static Object[] z = st.a(new Object[1], 7, 30, 18);
   static int m;
   static int f_l;
   static int k;
   static int x;
   static int s;
   static int p;
   static int t;
   static int y;
   static int u;
   static int v;
   static int n;
   static Object[] w = ho.a(-1, 95, new Object[1], true);
   static String q;


   final boolean a() {
      ++m;
      return pb.a(6, this.r);
   }

   final void c() {
      ++f_l;
      pda.a(this.r, -72);
   }

   static final int a(int var0, Object[] var1, int var2) {
      ++k;
      if(var0 != 6) {
         a(-90, (Object[])null, -75);
      }

      return !se.a((Object[])((Object[])var1[0]), (byte)-122)?1:3;
   }

   static final boolean a(Object[] var0, int var1) {
      if(var1 != 23201) {
         a(((int[])((int[])((Object[])((Object[])z[19]))[7]))[4], (Object[])null, -88);
      }

      ++x;
      return (((D3DCAPS)var0[77]).VertexShaderVersion & '\uffff') >= 257;
   }

   final boolean b() {
      ++s;
      boolean var1 = true;
      return var1;
   }

   final int f() {
      ++o;
      Object[] var2 = this.r;
      if(((boolean[])((boolean[])var2[5]))[0]) {
         throw new IllegalStateException();
      } else {
         byte var1 = 0;
         ((OpenGL)var2[3]).swapBuffers(((long[])((long[])var2[6]))[0]);
         return var1;
      }
   }

   final void b(int var1, int var2) {
      ++u;
      dm.a((byte)-125, var1, var2, this.r);
   }

   final int d() {
      ++v;
      Object[] var2 = this.r;
      int var1 = ((int[])((int[])var2[1]))[0];
      return var1;
   }

   static final Object[] b(Object[] var0, byte var1) {
      if(var1 >= -100) {
         return (Object[])null;
      } else {
         ++p;
         return ai.a;
      }
   }

   final int a(int var1, int var2) {
      ++t;
      return tq.a(var2, (byte)96, var1, this.r);
   }

   static final void a(Object[] var0, byte var1) {
      synchronized(var0[0]) {
         dq.a(-119, (Object[])((Object[])var0[0]));
         if(var1 != -43) {
            a((Object[])((Object[])z[3]), (int)-53);
         }
      }

      ++y;
   }

   final int e() {
      ++A;
      Object[] var2 = this.r;
      int var1 = ((int[])((int[])var2[1]))[1];
      return var1;
   }

   ida(Object[] var1) {
      this.r = var1;
   }

   static final void a(int var0) {
      ++n;
      ww.r = var0;
      kv.e = lba.f;
      ta.a(qca.f, "", qca.f.equals(""), 101, true);
   }

}
