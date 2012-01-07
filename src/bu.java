import jaggl.OpenGL;

final class bu {

   static int e;
   static int d;
   static Object[] b = lga.a(2, new Object[3], "game3", 1, "Game 3");
   static int a;
   static int c;
   static Object[] f;


   static final boolean a(Object[] var0, int var1) {
      ++a;
      int var2 = joa.a(var0, (int)3);
      ah.a((Object[])((Object[])var0[5]), var0, (byte)96);
      OpenGL.glGenerateMipmapEXT(((int[])((int[])var0[1]))[2]);
      if(var1 >= -57) {
         return false;
      } else {
         ((boolean[])((boolean[])var0[4]))[0] = true;
         df.a((int)23060, var0);
         ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[17] -= var2;
         ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[17] += joa.a(var0, (int)3);
         return true;
      }
   }

   static final fl b(Object[] var0, int var1) {
      if(var1 != 5) {
         ((byte[])((byte[])var0[3]))[2] = 25;
      }

      ++d;
      return new fl(var0);
   }

   static final int a(int var0, Object[] var1, Object[] var2) {
      ++c;
      int var3;
      if(vk.f == var1) {
         var3 = ((int[])((int[])var2[0]))[1];
         if(4 != var3) {
            if(5 == var3) {
               return 6409;
            } else if(var3 != 9) {
               if(var3 != 7) {
                  if(var3 == 1) {
                     return 6410;
                  } else {
                     throw new IllegalArgumentException();
                  }
               } else {
                  return 6408;
               }
            } else {
               return 6407;
            }
         } else {
            return 6406;
         }
      } else if(var1 == vk.e) {
         var3 = ((int[])((int[])var2[0]))[1];
         if(var3 != 7) {
            if(8 != var3) {
               if(var3 == 9) {
                  return '\u8054';
               } else if(var3 != 4) {
                  if(var3 == 5) {
                     return '\u8042';
                  } else if(var3 != 1) {
                     throw new IllegalArgumentException();
                  } else {
                     return '\u8d7b';
                  }
               } else {
                  return '\u803e';
               }
            } else {
               return '\u81a5';
            }
         } else {
            return '\u805b';
         }
      } else if(var1 == vk.b) {
         var3 = ((int[])((int[])var2[0]))[1];
         if(var3 != 8) {
            throw new IllegalArgumentException();
         } else {
            return '\u81a6';
         }
      } else if(vk.f_i == var1) {
         var3 = ((int[])((int[])var2[0]))[1];
         if(var3 == 4) {
            return '\u881c';
         } else if(var3 == 9) {
            return '\u881b';
         } else if(var3 == 5) {
            return '\u881e';
         } else if(var3 == 7) {
            return '\u881a';
         } else if(var3 != 1) {
            throw new IllegalArgumentException();
         } else {
            return '\u881f';
         }
      } else if(var1 != vk.h) {
         if(var0 <= 41) {
            b = (Object[])((Object[])b[2]);
         }

         throw new IllegalArgumentException();
      } else {
         var3 = ((int[])((int[])var2[0]))[1];
         if(var3 != 5) {
            if(var3 != 4) {
               if(7 != var3) {
                  if(var3 == 9) {
                     return '\u8815';
                  } else if(1 == var3) {
                     return '\u8819';
                  } else {
                     throw new IllegalArgumentException();
                  }
               } else {
                  return '\u8814';
               }
            } else {
               return '\u8816';
            }
         } else {
            return '\u8818';
         }
      }
   }

   static final int a(byte var0, Object[] var1) {
      if(var0 <= 83) {
         a(-36, (Object[])null, (Object[])null);
      }

      ++e;
      return ((int[])((int[])var1[1]))[1];
   }

   static {
      Object[] var2 = new Object[1];
      f = var2;
   }
}
