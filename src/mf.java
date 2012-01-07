
final class mf {

   static int f;
   static Object[] d = sd.a(new Object[1], 3, (byte)113);
   static int a;
   static int b;
   static int c;
   static byte[][] e;


   static final void a() {
      for(int var0 = hga.g; var0 < ri.n; ++var0) {
         for(int var1 = 0; var1 < eja.c; ++var1) {
            for(int var2 = 0; var2 < me.c; ++var2) {
               Object[] var3 = ju.g[var0][var1][var2];
               if(var3 != null) {
                  Object[] var4 = (Object[])((Object[])var3[4]);
                  Object[] var5 = (Object[])((Object[])var3[2]);
                  if(var4 != null && fja.a(9, var4)) {
                     Class_h.a(var4, var0, var1, var2, 1, 1);
                     if(var5 != null && fja.a(9, var5)) {
                        Class_h.a(var5, var0, var1, var2, 1, 1);
                        wfa.a(0, 1, false, 0, mpa.b, 0, var4, var5);
                        rda.b(-82, var5);
                     }

                     rda.b(-75, var4);
                  }

                  Object[] var6;
                  for(var6 = (Object[])((Object[])var3[3]); var6 != null; var6 = (Object[])((Object[])var6[0])) {
                     Object[] var7 = (Object[])((Object[])var6[1]);
                     if(var7 != null && fja.a(9, var7)) {
                        Class_h.a(var7, var0, var1, var2, ((short[])((short[])var7[13]))[0] - ((short[])((short[])var7[13]))[1] + 1, ((short[])((short[])var7[13]))[2] - ((short[])((short[])var7[13]))[3] + 1);
                        rda.b(-73, var7);
                     }
                  }

                  var6 = (Object[])((Object[])var3[6]);
                  if(var6 != null && fja.a(9, var6)) {
                     wp.a(var6, var0, var1, var2);
                     rda.b(68, var6);
                  }
               }
            }
         }
      }

   }

   static final void a(Object[] var0, int var1) {
      ++b;

      for(int var2 = 0; joa.h > var2; ++var2) {
         int var3 = tga.a((int)1, var0);
         int var4 = de.a((int)0, var0);
         if(var4 == '\uffff') {
            var4 = -1;
         }

         if(oi.d[var3] != null) {
            ((int[])((int[])oi.d[var3][0]))[2] = var4;
         }
      }

      if(var1 != 6) {
         e = (byte[][])((byte[][])null);
      }

      if(var0 != null && (var0.length == 19 || var0.length == 21 && var0[8].equals(Integer.valueOf(2)))) {
         a((Object[])null, var1 ^ 0);
      }

   }

   static final void a(byte var0, Object[] var1) {
      cc.a(var1, 6);
      ++c;
      if(var0 > -95) {
         a(31, (int[][])((int[][])((Object[])((Object[])var1[0]))[22]), new Object[19], ((int[])((int[])d[0]))[6], (byte)19, -13);
      }

   }

   static final void b(byte var0, Object[] var1) {
      sea.a((Object[])((Object[])var1[28]), (Object[])((Object[])var1[16]), (byte)89);
      ++f;
      vta.a((Object[])((Object[])var1[33]), (Object[])((Object[])var1[16]), 66);
      dp.a(((float[][])((float[][])var1[14]))[0], -126, (Object[])((Object[])var1[16]));
      if(null == var1 || var1.length != 16 && (4 != var1.length || !var1[3].equals(Integer.valueOf(1)))) {
         rt.a((Object[])((Object[])var1[16]), ((float[][])((float[][])var1[14]))[1], (byte)90);
         if(var0 > -71) {
            a(-111, (int[][])((int[][])null), (Object[])null, 87, ((byte[])((byte[])var1[1]))[3], ((int[])((int[])d[16]))[1]);
         }

         bj.a((byte)-79, ((float[][])((float[][])var1[14]))[2], (Object[])((Object[])var1[16]));
         kc.a(0, ((float[][])((float[][])var1[14]))[3], (Object[])((Object[])var1[16]));
         bia.a(((float[][])((float[][])var1[14]))[4], (Object[])((Object[])var1[16]), 110);
         fda.a(20504, ((float[][])((float[][])var1[14]))[5], (Object[])((Object[])var1[16]));
         sea.a((Object[])((Object[])var1[16]), (Object[])((Object[])var1[51]), (byte)118);
         bpa.a((Object[])((Object[])var1[51]), (byte)80, var1);
      }
   }

   static final af a(int var0, int[][] var1, Object[] var2, int var3, byte var4, int var5) {
      if(var4 != -46) {
         a(((byte[])((byte[])var2[23]))[16], (Object[])((Object[])((Object[])((Object[])d[10]))[12]));
      }

      ++a;
      return new af(var2, var5, var0, var3, var1);
   }

}
