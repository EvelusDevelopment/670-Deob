
final class uja {

   static int b;
   static int c;
   static boolean f = false;
   static Object[] d = ho.a(3, 47, new Object[1], true);
   static int g;
   static int e;
   static Object[][] h = new Object[2048][];
   static boolean[] a = new boolean[104];


   static final void a(int var0, int var1, int var2, Object[] var3, int var4) {
      if(var2 >= 120) {
         ++e;
         Object[] var5 = ro.a((int)3, var3);
         Object[] var6 = (Object[])((Object[])var3[30]);
         int var7 = 16383 & -((int[])((int[])((Object[])((Object[])var3[35]))[0]))[1] + ((int[])((int[])var3[12]))[31];
         if(-1 == var4) {
            if(var7 == 0 && ((int[])((int[])var3[12]))[16] <= 25) {
               if(!((boolean[])((boolean[])var3[8]))[7] || !wka.a(var5, 3, lt.a((byte)122, var6))) {
                  rs.a(cp.a(var5, -127), var6, -43);
                  ((boolean[])((boolean[])var3[8]))[7] = wna.a(var6, 4);
               }
            } else if(var1 < 0 && ~((int[])((int[])var5[1]))[6] != 0) {
               rs.a(((int[])((int[])var5[1]))[6], var6, -118);
               ((boolean[])((boolean[])var3[8]))[7] = false;
            } else if(var1 > 0 && 0 != ~((int[])((int[])var5[1]))[7]) {
               rs.a(((int[])((int[])var5[1]))[7], var6, -78);
               ((boolean[])((boolean[])var3[8]))[7] = false;
            } else if(!((boolean[])((boolean[])var3[8]))[7] || !wka.a(var5, 3, lt.a((byte)117, var6))) {
               rs.a(cp.a(var5, -127), var6, 120);
               ((boolean[])((boolean[])var3[8]))[7] = wna.a((Object[])((Object[])var3[30]), 4);
            }
         } else if(~((int[])((int[])var3[12]))[14] != 0 && (10240 <= var7 || 2048 >= var7)) {
            int var8 = -((int[])((int[])((Object[])((Object[])var3[35]))[0]))[1] + un.b[var0] & 16383;
            if(2 == var4 && ((int[])((int[])var5[1]))[10] != -1) {
               if(var8 > 2048 && 6144 >= var8 && -1 != ((int[])((int[])var5[1]))[23]) {
                  rs.a(((int[])((int[])var5[1]))[23], var6, -31);
               } else if(var8 >= 10240 && var8 < 14336 && -1 != ((int[])((int[])var5[1]))[28]) {
                  rs.a(((int[])((int[])var5[1]))[28], var6, -26);
               } else if(6144 < var8 && 10240 > var8 && ~((int[])((int[])var5[1]))[25] != 0) {
                  rs.a(((int[])((int[])var5[1]))[25], var6, -92);
               } else {
                  rs.a(((int[])((int[])var5[1]))[10], var6, 116);
               }
            } else if(0 == var4 && ((int[])((int[])var5[1]))[22] != -1) {
               if(2048 < var8 && 6144 >= var8 && ~((int[])((int[])var5[1]))[9] != 0) {
                  rs.a(((int[])((int[])var5[1]))[9], var6, 115);
               } else if(10240 <= var8 && 14336 > var8 && ~((int[])((int[])var5[1]))[37] != 0) {
                  rs.a(((int[])((int[])var5[1]))[37], var6, 126);
               } else if(6144 < var8 && 10240 > var8 && ~((int[])((int[])var5[1]))[11] != 0) {
                  rs.a(((int[])((int[])var5[1]))[11], var6, -82);
               } else {
                  rs.a(((int[])((int[])var5[1]))[22], var6, -53);
               }
            } else if(2048 < var8 && var8 <= 6144 && ((int[])((int[])var5[1]))[1] != -1) {
               rs.a(((int[])((int[])var5[1]))[1], var6, 114);
            } else if(10240 <= var8 && var8 < 14336 && ((int[])((int[])var5[1]))[18] != -1) {
               rs.a(((int[])((int[])var5[1]))[18], var6, -114);
            } else if(6144 < var8 && 10240 > var8 && 0 != ~((int[])((int[])var5[1]))[5]) {
               rs.a(((int[])((int[])var5[1]))[5], var6, 126);
            } else {
               rs.a(((int[])((int[])var5[1]))[12], var6, -12);
            }

            ((boolean[])((boolean[])var3[8]))[7] = false;
         } else if(0 == var7 && ((int[])((int[])var3[12]))[16] <= 25) {
            if(2 == var4 && -1 != ((int[])((int[])var5[1]))[10]) {
               rs.a(((int[])((int[])var5[1]))[10], var6, -60);
            } else if(var4 == 0 && 0 != ~((int[])((int[])var5[1]))[22]) {
               rs.a(((int[])((int[])var5[1]))[22], var6, -18);
            } else {
               rs.a(((int[])((int[])var5[1]))[12], var6, -67);
            }

            ((boolean[])((boolean[])var3[8]))[7] = false;
         } else {
            if(var4 == 2 && 0 != ~((int[])((int[])var5[1]))[10]) {
               if(var1 < 0 && ~((int[])((int[])var5[1]))[24] != 0) {
                  rs.a(((int[])((int[])var5[1]))[24], var6, -40);
               } else if(0 < var1 && ((int[])((int[])var5[1]))[26] != -1) {
                  rs.a(((int[])((int[])var5[1]))[26], var6, 113);
               } else {
                  rs.a(((int[])((int[])var5[1]))[10], var6, 123);
               }
            } else if(0 == var4 && ~((int[])((int[])var5[1]))[22] != 0) {
               if(var1 < 0 && -1 != ((int[])((int[])var5[1]))[4]) {
                  rs.a(((int[])((int[])var5[1]))[4], var6, -37);
               } else if(var1 > 0 && 0 != ~((int[])((int[])var5[1]))[21]) {
                  rs.a(((int[])((int[])var5[1]))[21], var6, 120);
               } else {
                  rs.a(((int[])((int[])var5[1]))[22], var6, -35);
               }
            } else if(var1 < 0 && ((int[])((int[])var5[1]))[29] != -1) {
               rs.a(((int[])((int[])var5[1]))[29], var6, -74);
            } else if(0 < var1 && ((int[])((int[])var5[1]))[2] != -1) {
               rs.a(((int[])((int[])var5[1]))[2], var6, -48);
            } else {
               rs.a(((int[])((int[])var5[1]))[12], var6, 115);
            }

            ((boolean[])((boolean[])var3[8]))[7] = false;
         }

      }
   }

   static final boolean a(Object[] var0, int var1, int var2, ta var3, byte var4) {
      ++g;
      if(var4 != 40) {
         a(((int[])((int[])var0[7]))[1], ((int[])((int[])((Object[])((Object[])var0[0]))[2]))[12], ((int[])((int[])var0[14]))[6], (Object[])null, -110);
      }

      return false;
   }

   static final void a(int var0, int var1, int var2) {
      ++c;
      if(1 == gd.h) {
         qd.a(4204, ij.f, var0, var2);
      } else if(2 == gd.h) {
         bt.a(var0, var2, (byte)-121);
      }

      if(var1 != -14829) {
         ((long[])((long[])d[1]))[10] = 49L;
      }

      ij.f = null;
      gd.h = 0;
   }

   static final Object[] a(boolean var0, Object[] var1) {
      ++b;
      if(!var0) {
         a(((boolean[])((boolean[])var1[14]))[4], (Object[])null);
      }

      Object[] var2 = toa.b(var1, -70);
      iha.a(var2, (int)9656);
      return var2;
   }

}
