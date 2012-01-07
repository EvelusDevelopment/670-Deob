import jaggl.OpenGL;

final class fd {

   static int c;
   static int f;
   static int d;
   static int b;
   static Object[] e = sd.a(new Object[1], 2, (byte)118);
   static int g;
   static int f_i;
   static Object[] h = ed.a(2, new Object[1], (byte)-105, 116);
   static int a;


   static final void a(Object[] var0, boolean var1) {
      ++g;
      if(!var1) {
         a((Object[])((Object[])e[0]), ((byte[])((byte[])e[14]))[5]);
      }

      if(((boolean[])((boolean[])var0[2]))[0]) {
         if(((boolean[])((boolean[])var0[2]))[1]) {
            ((boolean[])((boolean[])var0[2]))[1] = false;
         } else {
            ((boolean[])((boolean[])var0[2]))[0] = false;
         }
      } else {
         ((boolean[])((boolean[])var0[2]))[0] = true;
         ((boolean[])((boolean[])var0[2]))[1] = true;
      }

   }

   static final jp a(byte var0, Object[] var1) {
      if(var0 != -76) {
         return (jp)null;
      } else {
         ++c;
         return new jp(var1);
      }
   }

   static final void a(Object[] var0, Object[] var1, byte var2) {
      ++f;
      if(fh.a(var1, false) != 255) {
         --((int[])((int[])var1[1]))[0];
         ((long[])((long[])var0[12]))[0] = Class_i.a(false, var1);
      }

      var0[4] = dv.a(var1, (byte)-30);
      if(var2 != 127) {
         a((Object[])((Object[])h[0]), (byte)-16);
      }

      ((int[])((int[])var0[1]))[0] = de.a((int)0, var1);
   }

   static final byte[] a(int var0, int var1, Object[] var2) {
      try {
         ++d;
         if(ev.a((int)4120, var2)) {
            if(var0 == ~((int[])((int[])((Object[])((Object[])var2[3]))[5])).length) {
               return qn.a(0, var1, var2, -51);
            } else if(!sda.a(var1, var2, var0 ^ -19)) {
               return null;
            } else if(((int[])((int[])((Object[])((Object[])var2[3]))[5]))[var1] == 1) {
               return qn.a(var1, 0, var2, -80);
            } else {
               throw new RuntimeException();
            }
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw vt.a(var4, "fd.C(" + var0 + ',' + var1 + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   static final void a(Object[] var0, byte var1) {
      if(var0[0] == null) {
         var0[0] = new boolean[1];
      }

      int var2 = 104 % ((-22 - var1) / 50);
      ++a;
      if(null == var0[1]) {
         var0[1] = new int[12];
      }

      if(null == var0[2]) {
         var0[2] = new long[1];
      }

   }

   static final void a(int var0) {
      ++b;
      if(var0 <= 72) {
         a(-41);
      }

      if(nb.b > 1) {
         ih.a(tu.d, (Object[])((Object[])tu.d[27]), 4, -96);
      } else {
         ih.a(tu.d, (Object[])((Object[])tu.d[27]), 2, -96);
      }

   }

   static final void a(int var0, Object[] var1, int var2) {
      if(var2 >= -110) {
         h = (Object[])((Object[])var1[1]);
      }

      oga.q[3] = (float)(var0 >>> 24) / 255.0F;
      oga.q[0] = (float)(16711680 & var0) / 1.671168E7F;
      ++f_i;
      oga.q[1] = (float)(var0 & '\uff00') / 65280.0F;
      oga.q[2] = (float)(var0 & 255) / 255.0F;
      OpenGL.glTexEnvfv(8960, 8705, oga.q, 0);
   }

}
