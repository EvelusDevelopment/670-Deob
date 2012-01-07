import jaggl.OpenGL;

final class qoa {

   static hna[] b = new hna[1024];
   static int d;
   static int a;
   static int c;


   static final Object[] a(Object[] var0, Object[] var1, byte var2) {
      if(null == var0[0]) {
         var0[0] = new int[5];
      }

      ++d;
      sea.b(var1, var0, (byte)-127);
      ((int[])((int[])var0[0]))[1] = de.a((int)0, var1);
      ((int[])((int[])var0[0]))[4] = de.a((int)0, var1);
      int var3 = 83 % ((var2 - 58) / 48);
      var0[1] = ara.b((byte)61, var1);
      ((int[])((int[])var0[0]))[2] = lr.a(1, var1);
      ((int[])((int[])var0[0]))[3] = de.a((int)0, var1);
      return var0;
   }

   static final void a(int var0) {
      if(var0 != -18962) {
         b = (hna[])null;
      }

      ++a;
      if(cl.c == null) {
         if(~ce.a != 0) {
            kv.e = lba.h;
            ww.r = 162;
            ta.a(qca.f, "", qca.f.equals(""), 72, true);
         } else {
            String var1 = tba.c;
            String var2 = bm.f;
            ww.r = 162;
            kv.e = lba.h;
            ta.a(var1, var2, false, 64, false);
         }
      } else {
         fc.a(-128);
      }

   }

   static final Object[] a(int var0, Object[] var1, int var2, Object[] var3) {
      ++c;
      int var4 = -70 % ((39 - var2) / 52);
      oe.a(0, var1);
      ((int[])((int[])var1[0]))[0] = OpenGL.glGenLists(var0);
      return var1;
   }

}
