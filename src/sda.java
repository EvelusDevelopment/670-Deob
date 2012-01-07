import jaggl.OpenGL;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class sda {

   static int h;
   static int f_i;
   static int f;
   static int b;
   static int c = 100;
   static int g;
   static int e;
   static int a;
   static int d;
   static float[] j = new float[3];


   static final int a(int var0, Object[] var1) {
      ++f_i;
      ((int[])((int[])var1[1]))[0] += 4;
      return var0 != 18?88:(255 & ((byte[])((byte[])var1[2]))[((int[])((int[])var1[1]))[0] - 4]) + ((((byte[])((byte[])var1[2]))[-2 + ((int[])((int[])var1[1]))[0]] & 255) << 16) + (-16777216 & ((byte[])((byte[])var1[2]))[-1 + ((int[])((int[])var1[1]))[0]] << 24) + ((255 & ((byte[])((byte[])var1[2]))[((int[])((int[])var1[1]))[0] - 3]) << 8);
   }

   static final boolean a(Object[] var0, int var1, int var2) {
      if(var1 != 2) {
         a((int[])null, (Object[])null, -78, false, ((int[])((int[])var0[3]))[2], 118, -27, ((int[])((int[])var0[3]))[1], -57, ((int[])((int[])var0[2]))[7]);
      }

      ++b;
      if(var0[15] != null && var2 != -1) {
         for(int var3 = 0; ((int[])((int[])var0[15])).length > var3; ++var3) {
            if(var2 == ((int[])((int[])var0[15]))[var3]) {
               return true;
            }
         }

         if(null != var0 && (var0.length == 24 || 6 == var0.length)) {
            ala.a((Object[])null, (Object[])null, -54, ((int[])((int[])ria.a[4]))[3], (aa)null, ((int[])((int[])ria.a[9]))[2], ((int[])((int[])((Object[])((Object[])ria.a[15]))[14]))[0], (ta)null, 0, (aa)ria.a[3], (Object[])null, 91, ((int[])((int[])ria.a[5]))[3]);
         }
      }

      return false;
   }

   static final boolean a(byte var0, Object[] var1, int var2) throws IOException {
      ++d;
      if(var2 > 0 && var2 < ((int[])((int[])var1[1]))[0]) {
         if(var0 > -36) {
            return true;
         } else {
            synchronized(var1 == null?null:var1[2]) {
               int var5;
               if(~((int[])((int[])var1[1]))[2] <= ~((int[])((int[])var1[1]))[1]) {
                  var5 = ((int[])((int[])var1[1]))[2] - ((int[])((int[])var1[1]))[1];
               } else {
                  var5 = ((int[])((int[])var1[1]))[0] - ((int[])((int[])var1[1]))[1] + ((int[])((int[])var1[1]))[2];
               }

               if(var2 <= var5) {
                  return true;
               } else if(var1[3] == null) {
                  var1[2].notifyAll();
                  return false;
               } else {
                  throw new IOException(((Throwable)var1[3]).toString());
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   static final ka a(ta var0, byte var1, Object[] var2, int var3) {
      ++e;
      if(var1 <= 122) {
         a((ta)null, (byte)24, (Object[])((Object[])var2[5]), 33);
      }

      if(null != var2[19] && 0 == var0.d(((ka)var2[19]).va(), var3)) {
         return (ka)var2[19];
      } else {
         Object[] var4 = qra.a(var3, false, var0, var2, -128);
         return var4 != null?(ka)var4[1]:null;
      }
   }

   static final void a(Object[] var0, byte var1) {
      ++f;
      al var2;
      Object[] var4 = (var2 = (al)dda.a(gha.c, var1 + 103)) != null?var2.m:null;
      if(var4 != null) {
         if(var4 != null && var4.length == 5 && var4[0].equals(Integer.valueOf(2))) {
            gha.c = (Object[])((Object[])gha.c[5]);
         }

         int var5 = ((int[])((int[])var0[1]))[0];
         op.putInt(var0, ((int[])((int[])var4[1]))[0]);
         if(var1 == -101) {
            for(int var6 = 0; ~var6 > ~((int[])((int[])var4[1]))[1]; ++var6) {
               if(-1 == ~((int[])((int[])var4[2]))[var6]) {
                  try {
                     int var7 = ((int[])((int[])var4[0]))[var6];
                     Field var8;
                     int var9;
                     if(var7 == 0) {
                        var8 = ((Field[])((Field[])var4[7]))[var6];
                        var9 = var8.getInt((Object)null);
                        ek.putByte(var0, 0);
                        op.putInt(var0, var9);
                     } else if(1 != var7) {
                        if(2 == var7) {
                           var8 = ((Field[])((Field[])var4[7]))[var6];
                           var9 = var8.getModifiers();
                           ek.putByte(var0, 0);
                           op.putInt(var0, var9);
                        }
                     } else {
                        var8 = ((Field[])((Field[])var4[7]))[var6];
                        var8.setInt((Object)null, ((int[])((int[])var4[3]))[var6]);
                        ek.putByte(var0, 0);
                     }

                     Method var25;
                     if(var7 == 3) {
                        var25 = ((Method[])((Method[])var4[5]))[var6];
                        byte[][] var26 = ((byte[][][])((byte[][][])var4[6]))[var6];
                        Object[] var10 = new Object[var26.length];

                        for(int var11 = 0; var26.length > var11; ++var11) {
                           ObjectInputStream var12 = new ObjectInputStream(new ByteArrayInputStream(var26[var11]));
                           var10[var11] = var12.readObject();
                        }

                        Object var27 = var25.invoke((Object)null, var10);
                        if(null == var27) {
                           ek.putByte(var0, 0);
                        } else if(!(var27 instanceof Number)) {
                           if(!(var27 instanceof String)) {
                              ek.putByte(var0, 4);
                           } else {
                              ek.putByte(var0, 2);
                              bw.a((String)var27, (byte)0, var0);
                           }
                        } else {
                           ek.putByte(var0, 1);
                           wb.putLong(var0, ((Number)var27).longValue());
                        }
                     } else if(var7 == 4) {
                        var25 = ((Method[])((Method[])var4[5]))[var6];
                        var9 = var25.getModifiers();
                        ek.putByte(var0, 0);
                        op.putInt(var0, var9);
                     }
                  } catch (ClassNotFoundException var13) {
                     ek.putByte(var0, -10);
                  } catch (InvalidClassException var14) {
                     ek.putByte(var0, -11);
                  } catch (StreamCorruptedException var15) {
                     ek.putByte(var0, -12);
                  } catch (OptionalDataException var16) {
                     ek.putByte(var0, -13);
                  } catch (IllegalAccessException var17) {
                     ek.putByte(var0, -14);
                  } catch (IllegalArgumentException var18) {
                     ek.putByte(var0, -15);
                  } catch (InvocationTargetException var19) {
                     ek.putByte(var0, -16);
                  } catch (SecurityException var20) {
                     ek.putByte(var0, -17);
                  } catch (IOException var21) {
                     ek.putByte(var0, -18);
                  } catch (NullPointerException var22) {
                     ek.putByte(var0, -19);
                  } catch (Exception var23) {
                     ek.putByte(var0, -20);
                  } catch (Throwable var24) {
                     ek.putByte(var0, -21);
                  }
               } else {
                  ek.putByte(var0, ((int[])((int[])var4[2]))[var6]);
               }
            }

            mla.a(var0, (byte)109, var5);
            ((lm)(null == var4?null:var4[4])).a((byte)114);
         }
      }
   }

   static final void a(int[] var0, Object[] var1, int var2, boolean var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if(var9 == var7) {
         var9 = var4;
      }

      ++a;
      if(var3) {
         int[] var10 = new int[var6 * var4];

         for(int var11 = 0; var6 > var11; ++var11) {
            int var12 = var4 * var11;
            int var13 = var5 + var9 * (var6 + -var11 - 1);

            for(int var14 = 0; var4 > var14; ++var14) {
               var10[var12++] = var0[var13++];
            }
         }

         if(var1 != null && (5 == var1.length || var1.length == 4 && var1[2].equals(Boolean.valueOf(false)) && var1[2].equals(Boolean.valueOf(false)))) {
            wqa.a((Object[])null, (Object[])null, (Object[])null, (Object[])null, false, 1, -4, 9, true, 37, (byte[])null, (Object[])null);
         }

         var0 = var10;
      }

      moa.a((byte)113, var1, (Object[])((Object[])var1[4]));
      if(var9 != var4) {
         OpenGL.glPixelStorei(3314, var9);
      }

      OpenGL.glTexSubImage2Di(((int[])((int[])var1[1]))[2], 0, var2, ((int[])((int[])var1[1]))[4] - (var8 + var6), var4, var6, '\u80e1', ((int[])((int[])((Object[])((Object[])var1[4]))[1]))[37], var0, var5);
      if(var9 != var4) {
         OpenGL.glPixelStorei(3314, 0);
      }

   }

   static final boolean a(int var0, Object[] var1, int var2) {
      ++h;
      if(ev.a((int)4120, var1)) {
         if(var2 < 11) {
            var1[1] = var1[1];
         }

         if(0 <= var0 && ~var0 > ~((int[])((int[])((Object[])((Object[])var1[3]))[5])).length && ((int[])((int[])((Object[])((Object[])var1[3]))[5]))[var0] != 0) {
            return true;
         } else if(!bm.a) {
            return false;
         } else {
            throw new IllegalArgumentException(Integer.toString(var0));
         }
      } else {
         return false;
      }
   }

   static final ka a(Object[] var0, ta var1, int var2, int var3) {
      if(var2 != -11121) {
         c = ((int[])((int[])var0[0]))[7];
      }

      ++g;
      if(var0[18] != null && 0 == var1.d(((ka)var0[18]).va(), var3)) {
         return (ka)var0[18];
      } else {
         Object[] var4 = qaa.a(var3, 1, var0, var1, false);
         return null == var4?null:(ka)var4[1];
      }
   }

}
